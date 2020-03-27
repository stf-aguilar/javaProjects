/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.table.DefaultTableModel;

public class VentanaMostrarRespuestas extends javax.swing.JDialog {
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private String usuario1, usuario2;
    private int vecesGano1, vecesGano2, vecesEmpate;
    
    public VentanaMostrarRespuestas(java.awt.Frame parent, boolean modal, String usuario1, 
            String usuario2, int vecesGano1, int vecesGano2, int vecesEmpate) {
        super(parent, modal);
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.vecesGano1 = vecesGano1;
        this.vecesGano2 = vecesGano2;
        this.vecesEmpate = vecesEmpate;
        cargarDatosTabla();
        setLocationRelativeTo(null);
        initComponents();
    }
    
    private void cargarDatosTabla(){
        modeloTabla.addColumn("Victorias: "+usuario1);
        modeloTabla.addColumn("Victorias: "+usuario2);
        modeloTabla.addColumn("Empates");
        
        String [] fila = {String.valueOf(vecesGano1), String.valueOf(vecesGano2), String.valueOf(vecesEmpate)};
        
        modeloTabla.addRow(fila);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTituloResultados = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaTituloResultados.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etiquetaTituloResultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTituloResultados.setText("RESULTADOS");
        getContentPane().add(etiquetaTituloResultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 400, 65));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 266, -1, -1));

        jTable1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jTable1.setModel(modeloTabla);
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 375, 161));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMostrarRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMostrarRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaMostrarRespuestas dialog = new VentanaMostrarRespuestas(new javax.swing.JFrame(), true, null, null, 0,0,0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaTituloResultados;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
