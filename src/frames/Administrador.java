/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import clases.Conexion;
import java.sql.*;

/**
 *
 * @author EDUARDO
 */
public class Administrador extends javax.swing.JFrame {

    String usuario, nombreUsuario;
    public static int sesionUsuario;

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();

        usuario = Login.usuario;

        //OPCIONES JFRAME        
        setResizable(false);
        setSize(750, 500);
        setLocationRelativeTo(null);
        setTitle("Panel de Administración - Logeado como " + usuario);

        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT nombre FROM usuarios WHERE username = '" + usuario + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                nombreUsuario = rs.getString("nombre");
                jLabel_NombreUsuario.setText("Bienvenido, " + nombreUsuario);
                
            }
        } catch (SQLException e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_NombreUsuario = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_NombreUsuario.setText("jLabel1");
        getContentPane().add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, -1));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_wallpaper;
    // End of variables declaration//GEN-END:variables
}
