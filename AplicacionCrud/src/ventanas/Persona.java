package ventanas;

import com.mysql.jdbc.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Persona extends javax.swing.JFrame {
    
    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnect=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "password";
    PreparedStatement ps;
    ResultSet rs;
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario,contraseña);
            
        }catch(Exception ex){
            System.err.println("Error "+ex);
        }
        return conexion;
    
    }

    
    public Persona() {
        initComponents();
        setLocationRelativeTo(null);
        cajaID.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        campoBuscar = new javax.swing.JTextField();
        cajaID = new javax.swing.JTextField();
        etiquetaClave = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoDomicilio = new javax.swing.JTextField();
        campoCelular = new javax.swing.JTextField();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaDomicilio = new javax.swing.JLabel();
        etiquetaCelular = new javax.swing.JLabel();
        etiquetaEmail = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        etiquetaFecha = new javax.swing.JLabel();
        campoFecha = new javax.swing.JTextField();
        etiquetaGenero = new javax.swing.JLabel();
        campoGenero = new javax.swing.JComboBox<>();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etiquetaClave.setText("Clave");

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        campoDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDomicilioActionPerformed(evt);
            }
        });

        etiquetaNombre.setText("Nombre");

        etiquetaDomicilio.setText("Domicilio");

        etiquetaCelular.setText("Celular");

        etiquetaEmail.setText("Email");

        etiquetaFecha.setText("Fecha de Nacimiento");

        etiquetaGenero.setText("Género");

        campoGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Genero", "Femenino", "Masculino", "otres" }));
        campoGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoGeneroActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaNombre)
                                    .addComponent(etiquetaClave)
                                    .addComponent(etiquetaDomicilio)
                                    .addComponent(etiquetaCelular)
                                    .addComponent(etiquetaEmail)
                                    .addComponent(etiquetaFecha)
                                    .addComponent(etiquetaGenero))
                                .addGap(94, 94, 94)
                                .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsertar)
                                .addGap(33, 33, 33)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btnLimpiar)
                                .addGap(22, 22, 22))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscar))
                                .addComponent(cajaID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaClave)
                    .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombre))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaDomicilio))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCelular))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEmail)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaFecha)
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaGenero)
                    .addComponent(campoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("select * from persona where clave=?");
            ps.setString(1, campoBuscar.getText());
            rs = ps.executeQuery();
            
            
            if(rs.next()){
                cajaID.setText(String.valueOf(rs.getInt("idPersona")));
                campoClave.setText(rs.getString("clave"));
                campoNombre.setText(rs.getString("nombre"));
                campoDomicilio.setText(rs.getString("domicilio"));
                campoCelular.setText(rs.getString("celular"));
                campoEmail.setText(rs.getString("correo_electronico"));
                campoFecha.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                campoGenero.setSelectedItem(rs.getString("genero"));
           }else{
                JOptionPane.showMessageDialog(null, "No se encuentra registrado");
            
           }
            
            conexion.close();
            
        }catch(Exception ex){
            System.err.println("Error "+ ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDomicilioActionPerformed

    private void campoGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoGeneroActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("delete from persona where idPersona=?"); 
            ps.setInt(1, Integer.parseInt(cajaID.getText()));
            
            int resultado = ps.executeUpdate();
            
            
            if(resultado > 0){
                System.out.println(resultado);
                JOptionPane.showMessageDialog(null,"Registro eliminado correctamente");
                limpiarCajas();
                
            }else{
                JOptionPane.showMessageDialog(null,"Error durante la eliminación");
                limpiarCajas();
            }
            
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error "+ex);
        }
                              
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("insert into persona (clave, nombre, domicilio, celular,correo_electronico,fecha_nacimiento,genero) values (?,?,?,?,?,?,?)"); ;
            ps.setString(1,campoClave.getText());
            ps.setString(2, campoNombre.getText());
            ps.setString(3, campoDomicilio.getText());
            ps.setString(4, campoCelular.getText());
            ps.setString(5,campoEmail.getText());
            ps.setDate(6, Date.valueOf(campoFecha.getText()));
            ps.setString(7, campoGenero.getSelectedItem().toString());
            
            int resultado = ps.executeUpdate();
            
            
            if(resultado > 0){
                System.out.println(resultado);
                JOptionPane.showMessageDialog(null,"Registro insertado correctamente");
                limpiarCajas();
                
            }else{
                JOptionPane.showMessageDialog(null,"Error durante el registro");
                limpiarCajas();
            }
            
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error "+ex);
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       limpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Connection conexion = null;
        
        try{
            conexion = getConnection();
            ps = conexion.prepareStatement("update persona set clave=?, nombre=?, domicilio=?, celular=?,correo_electronico=?,fecha_nacimiento=?,genero=? where idPersona=?"); 
            ps.setString(1,campoClave.getText());
            ps.setString(2, campoNombre.getText());
            ps.setString(3, campoDomicilio.getText());
            ps.setString(4, campoCelular.getText());
            ps.setString(5,campoEmail.getText());
            ps.setDate(6, Date.valueOf(campoFecha.getText()));
            ps.setString(7, campoGenero.getSelectedItem().toString());
            ps.setInt(8, Integer.parseInt(cajaID.getText()));
            
            int resultado = ps.executeUpdate();
            
            
            if(resultado > 0){
                System.out.println(resultado);
                JOptionPane.showMessageDialog(null,"Registro modificado correctamente");
                limpiarCajas();
                
            }else{
                JOptionPane.showMessageDialog(null,"Error durante la modificación");
                limpiarCajas();
            }
            
            conexion.close();
        }catch(Exception ex){
            System.err.println("Error "+ex);
        }
                               
    }//GEN-LAST:event_btnModificarActionPerformed

    
    public void limpiarCajas(){
        campoClave.setText(null);
        campoNombre.setText(null);
        campoDomicilio.setText(null);
        campoCelular.setText(null);
        campoEmail.setText(null);
        campoFecha.setText(null);
        campoGenero.getSelectedIndex(0);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField cajaID;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JTextField campoCelular;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextField campoDomicilio;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JComboBox<String> campoGenero;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel etiquetaCelular;
    private javax.swing.JLabel etiquetaClave;
    private javax.swing.JLabel etiquetaDomicilio;
    private javax.swing.JLabel etiquetaEmail;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaGenero;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

}
