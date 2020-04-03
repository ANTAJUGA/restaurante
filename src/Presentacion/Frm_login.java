package Presentacion;
import Persistencia.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Frm_login extends javax.swing.JFrame {
   static String nombreA;

    public Frm_login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        idUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordUser = new javax.swing.JPasswordField();
        btn_ingreso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Papyrus", 1, 30))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 255, 204));
        jPanel1.setLayout(null);

        idUser.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jPanel1.add(idUser);
        idUser.setBounds(670, 330, 140, 40);

        jLabel1.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUARIO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(470, 340, 140, 40);

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONTRASEÑA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(440, 410, 200, 29);

        passwordUser.setFont(new java.awt.Font("Candara Light", 0, 18)); // NOI18N
        jPanel1.add(passwordUser);
        passwordUser.setBounds(670, 400, 140, 40);

        btn_ingreso.setBackground(new java.awt.Color(102, 0, 0));
        btn_ingreso.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        btn_ingreso.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingreso.setText("INGRESAR");
        btn_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ingreso);
        btn_ingreso.setBounds(570, 500, 159, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loggin1.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 10, 1030, 580);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1070, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresoActionPerformed

       try {
           UsuarioDAO u=new UsuarioDAO();//creamos un on+bjeto
           //comparamos
           if(u.buscarUsuario(this.idUser.getText(),this.passwordUser.getText())==true){
               Frm_opciones o=new Frm_opciones();
               o.setVisible(true);
               this.dispose();
           }
           else{
               //mensaje de error
               JOptionPane.showMessageDialog(null, "NO EXISTE USUARIO", "AVISO", JOptionPane.ERROR_MESSAGE);
           }
       } catch (SQLException ex) {//PARA VERIFICAR ERROR DE SQL
           Logger.getLogger(Frm_login.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_btn_ingresoActionPerformed

   
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
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingreso;
    private javax.swing.JTextField idUser;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordUser;
    // End of variables declaration//GEN-END:variables
}
