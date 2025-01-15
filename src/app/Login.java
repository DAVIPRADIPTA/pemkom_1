/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;

import Admin.PageAdmin;
import Owner.PageOwner;
import Kasir.Transaksi;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class Login extends javax.swing.JFrame {

     UserProfile up = new UserProfile();
    
   
    public Login() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        TxtUsername = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(450, 330));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsernameActionPerformed(evt);
            }
        });
        jPanel4.add(TxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 220, -1));

        TxtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });
        jPanel4.add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 220, -1));

        jLabel1.setText("Password");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel2.setText("Username");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 220, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Sign in");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jPanel3.add(jPanel4, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsernameActionPerformed
        // TODO add your handling code here:
        TxtPassword.requestFocus();
    }//GEN-LAST:event_TxtUsernameActionPerformed

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed
        // TODO add your handling code here:
        LoginNow();
    }//GEN-LAST:event_TxtPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginNow();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login L = new Login();
                L.setVisible(true);
                L.setExtendedState(Frame.MAXIMIZED_BOTH);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField TxtUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

    private void LoginNow() {
        String user = TxtUsername.getText();
        String pass = new String(TxtPassword.getPassword());
        try {
            Connection c = Koneksi.Go();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM akun WHERE username='"+user+"' AND password='"+pass+"';";
            System.out.println(sql);
            ResultSet r = s.executeQuery(sql);
            
            int Status = 0;
            while(r.next()){
                up.setId_akun(r.getInt("id_akun"));
                up.setUsername(r.getString("username"));
                up.setPassword(r.getString("password"));
                up.setRole(r.getString("role"));
                
                Status++;
            }
//            System.out.println(Status);
            if(Status >= 1 ){
                Function.logActivity("Login berhasil " + up.getUsername() +"\n");
                 switch(up.getRole()) {
                    case "Admin":
                        PageAdmin admin = new PageAdmin(up);
                        admin.setVisible(true);
//                        new EditUser().setVisible(true);
                        this.setVisible(false);
                        break;
                    case "Kasir":
                        Transaksi kasir = new Transaksi(up);
                        kasir.setVisible(true);
                        this.setVisible(false);
                        break;
                    case "Owner":
                        PageOwner owner = new PageOwner(up);
                        owner.setVisible(true);
                        this.setVisible(false);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Role tidak valid.");
                        break;
                }
            }else {
               
                //login gagal
                JOptionPane.showMessageDialog(this, "GAGAL Login\n"+"Username/Password tidak valid");
                TxtPassword.requestFocus();
                System.out.println(Status);
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "gagal menagmbil data");
        }
    }


}
