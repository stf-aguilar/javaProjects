package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel panel;
	private JTable tabla;
	private JTextField cajaNombre;
	private JTextField cajaApellidos;
	private JTextField cajaEtiqueta;
	private JTextField cajaCelular;
	private JTextField cajaDireccion;
	private DefaultComboBoxModel<Persona>modelo = new DefaultComboBoxModel();
	private DefaultTableModel modeloTabla = new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		llenarModeloComboBox();
		agregarModeloTabla();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 100, 503, 524);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel etiquetaPersona = new JLabel("Persona");
		etiquetaPersona.setBounds(22, 12, 66, 15);
		panel.add(etiquetaPersona);
		
		JComboBox comboPersonas = new JComboBox();
		comboPersonas.setToolTipText("<Persona>");
		comboPersonas.setBounds(22, 32, 220, 24);
		comboPersonas.setModel(modelo);
		panel.add(comboPersonas);
		
		JButton botonInsertar = new JButton("Insertar persona");
		botonInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Persona p = (Persona) comboPersonas.getSelectedItem();
				String nombre = p.getNombre();
				String apellido = p.getApellidos();
				String email = p.getEmail();
				String celular = p.getCelular();
				String direccion = p.getDireccion();
				
				String [] persona = {nombre, apellido, email, celular, direccion};
				
				modeloTabla.addRow(persona);
			}
		});
		botonInsertar.setBounds(314, 32, 155, 25);
		panel.add(botonInsertar);
		
		JScrollPane scrollTabla = new JScrollPane();
		scrollTabla.setBounds(22, 68, 447, 149);
		panel.add(scrollTabla);
		
		tabla = new JTable();
		tabla.setModel(modeloTabla);
		ListSelectionListener  oyenteSeleccion = new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				if(arg0.getValueIsAdjusting()) {
					int filaSeleccionada = tabla.getSelectedRow();
					
					String nombres = (String) modeloTabla.getValueAt(filaSeleccionada, 0);
					String apellido = (String) modeloTabla.getValueAt(filaSeleccionada, 1);
					String email = (String) modeloTabla.getValueAt(filaSeleccionada,2);
					String celular = (String) modeloTabla.getValueAt(filaSeleccionada, 3);
					String direccion = (String) modeloTabla.getValueAt(filaSeleccionada, 4);
					
					cajaNombre.setText(nombres);
					cajaApellidos.setText(apellido);
					cajaEtiqueta.setText(email);
					cajaCelular.setText(celular);
					cajaDireccion.setText(direccion);
				}
				
			}
			
			
		}; 
		tabla.getSelectionModel().addListSelectionListener(oyenteSeleccion);
		scrollTabla.setViewportView(tabla);
		
		JSeparator separador = new JSeparator();
		separador.setBounds(32, 229, 441, 2);
		panel.add(separador);
		
		JLabel etiquetaDatos = new JLabel("Datos de la persona");
		etiquetaDatos.setBounds(22, 243, 220, 15);
		panel.add(etiquetaDatos);
		
		JLabel etiquetaNombre = new JLabel("Nombre");
		etiquetaNombre.setFont(new Font("Chandas", Font.PLAIN, 12));
		etiquetaNombre.setBounds(22, 270, 66, 15);
		panel.add(etiquetaNombre);
		
		cajaNombre = new JTextField();
		cajaNombre.setBounds(22, 298, 220, 15);
		panel.add(cajaNombre);
		cajaNombre.setColumns(10);
		
		JLabel etiquetaApellidos = new JLabel("Apellido");
		etiquetaApellidos.setBounds(269, 268, 66, 15);
		etiquetaApellidos.setFont(new Font("Chandas", Font.PLAIN, 12));
		panel.add(etiquetaApellidos);
		
		cajaApellidos = new JTextField();
		cajaApellidos.setBounds(269, 295, 200, 19);
		panel.add(cajaApellidos);
		cajaApellidos.setColumns(10);
		
		JLabel etiquetaEmail = new JLabel("Email");
		etiquetaEmail.setFont(new Font("Chandas", Font.PLAIN, 12));
		etiquetaEmail.setBounds(22, 325, 66, 15);
		panel.add(etiquetaEmail);
		
		JLabel etiquetaCelular = new JLabel("Celular");
		etiquetaCelular.setFont(new Font("Chandas", Font.PLAIN, 12));
		etiquetaCelular.setBounds(269, 326, 66, 15);
		panel.add(etiquetaCelular);
		
		cajaEtiqueta = new JTextField();
		cajaEtiqueta.setBounds(22, 352, 220, 19);
		panel.add(cajaEtiqueta);
		cajaEtiqueta.setColumns(10);
		
		cajaCelular = new JTextField();
		cajaCelular.setBounds(269, 352, 200, 19);
		panel.add(cajaCelular);
		cajaCelular.setColumns(10);
		
		JLabel etiquetaDireccion = new JLabel("Direccion");
		etiquetaDireccion.setFont(new Font("Chandas", Font.PLAIN, 12));
		etiquetaDireccion.setBounds(22, 399, 122, 15);
		panel.add(etiquetaDireccion);
		
		cajaDireccion = new JTextField();
		cajaDireccion.setBounds(22, 426, 447, 19);
		panel.add(cajaDireccion);
		cajaDireccion.setColumns(10);
	
		setLocationRelativeTo(null);
	}
	
	private void llenarModeloComboBox() {
		modelo.addElement(new Persona("Estefania","Aguilar","silestagui@gmail.com","222-333-4444","Gardeñas 2425"));
		modelo.addElement(new Persona("Sol","Ramirez","sol_r@gmail.com","222-333-5555","Melo 123"));
		modelo.addElement(new Persona("Vanesa","Sotto","vanesa_s@gmail.com","222-333-6666","Santa Fe 711"));
		modelo.addElement(new Persona("Antonela","Zarate","azarate@gmail.com","222-333-7777","Lauria 1170"));
		modelo.addElement(new Persona("Pablo","Perez","pp@gmail.com","222-333-8888","Potosi 96"));;
		modelo.addElement(new Persona("Eugenia","Lakapp","lakappeuge@gmail.com","222-333-9999","Yerbal 25"));;
		modelo.addElement(new Persona("Raquel","Gutierrez","gutiR@gmail.com","222-333-1010","Jujuy 422"));;
		modelo.addElement(new Persona("Lucia","Gomez","luchigomez@gmail.com","222-333-1111","Saenz Peña 1524"));;
		modelo.addElement(new Persona("Hector","Calderon","calderon123@gmail.com","222-333-3333","Catamarca 854"));;
		modelo.addElement(new Persona("Jose","Aguirre","jose_aguirre@gmail.com","222-333-1111","Belgrano 620"));;
	}
	
	private void agregarModeloTabla() {
		modeloTabla.addColumn("Nombres");
		modeloTabla.addColumn("Apellidos");
		modeloTabla.addColumn("Email");
		modeloTabla.addColumn("Celular");
		modeloTabla.addColumn("Dirección");
	}
}
