package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel panel;
	private JTextField campoUsuario;
	private JPasswordField campoContraseña;

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
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 488);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel btnSalir = new JLabel("Salir");
		btnSalir.setFont(new Font("DialogInput", Font.BOLD, 16));
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBackground(Color.GRAY);
		btnSalir.setHorizontalAlignment(SwingConstants.CENTER);
		btnSalir.setForeground(Color.BLACK);
		btnSalir.setBounds(328, 0, 66, 31);
		panel.add(btnSalir);
		
		JLabel etiquetaIcono = new JLabel("");
		etiquetaIcono.setIcon(new ImageIcon("/home/shinee/eclipse-workspace/login/src/imagenes/icono.png"));
		etiquetaIcono.setBounds(85, 97, 214, 211);
		panel.add(etiquetaIcono);
		
		JLabel etiquetaUsuario = new JLabel("Usuario:");
		etiquetaUsuario.setBounds(95, 320, 66, 15);
		panel.add(etiquetaUsuario);
		
		JLabel etiquetaContraseña = new JLabel("Contraseña:");
		etiquetaContraseña.setBounds(95, 374, 83, 15);
		panel.add(etiquetaContraseña);
		
		campoUsuario = new JTextField();
		campoUsuario.setText("");
		campoUsuario.setBounds(209, 320, 124, 19);
		panel.add(campoUsuario);
		campoUsuario.setColumns(10);
		
		campoContraseña = new JPasswordField();
		campoContraseña.setBounds(209, 374, 124, 19);
		panel.add(campoContraseña);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usuarioCorrecto = "Estefania";
				String contraseñaCorrecta = "java";
				
				if(usuarioCorrecto.equals(campoUsuario.getText())){
					String contraseña = "";
					
					for(int i=0;i<campoContraseña.getPassword().length;i++) {
						contraseña+=campoContraseña.getPassword()[i];
					}
					
					if(contraseñaCorrecta.equals(contraseña)) {
						JOptionPane.showMessageDialog(null, "Ingreso exitoso");
					}else {
						JOptionPane.showMessageDialog(null, "Contraseña desconocida");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Error. Usuario desconocido");
				}
					
				
			
			}
		});
		btnIniciarSesion.setBounds(209, 420, 128, 25);
		panel.add(btnIniciarSesion);
		
		JLabel etiquetaFondo = new JLabel("");
		etiquetaFondo.setIcon(new ImageIcon("/home/shinee/eclipse-workspace/login/src/imagenes/fondo.jpg"));
		etiquetaFondo.setBounds(0, 0, 394, 488);
		panel.add(etiquetaFondo);
		
		setLocationRelativeTo(null);
	}
}
