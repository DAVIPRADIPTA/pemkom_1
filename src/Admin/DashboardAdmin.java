/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin;

import app.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author asus
 */
public class DashboardAdmin extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    public DashboardAdmin() {
        initComponents();
        getJumlahUser();
        getJumlahProduk();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jumlahUser = new javax.swing.JLabel();
        USER1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jumlahProduk = new javax.swing.JLabel();
        USER = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jumlahUser.setBackground(new java.awt.Color(102, 102, 102));
        jumlahUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jumlahUser.setForeground(new java.awt.Color(255, 255, 255));
        jumlahUser.setText("jLabel1");

        USER1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        USER1.setForeground(new java.awt.Color(255, 255, 255));
        USER1.setText("USER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jumlahUser))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(USER1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(USER1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jumlahUser)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jumlahProduk.setBackground(new java.awt.Color(102, 102, 102));
        jumlahProduk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jumlahProduk.setForeground(new java.awt.Color(255, 255, 255));
        jumlahProduk.setText("jLabel1");

        USER.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        USER.setForeground(new java.awt.Color(255, 255, 255));
        USER.setText("PRODUK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jumlahProduk))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(USER)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(USER)
                .addGap(11, 11, 11)
                .addComponent(jumlahProduk)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel USER;
    private javax.swing.JLabel USER1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jumlahProduk;
    private javax.swing.JLabel jumlahUser;
    // End of variables declaration//GEN-END:variables

    private void getJumlahUser() {
        Connection con = Koneksi.Go();

        String query = "SELECT COUNT(*) AS jumlah_data FROM akun";

        try {
             PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int jumlahDataUser = rs.getInt("jumlah_data");
//                System.out.println("Jumlah data di tabel akun: " + jumlahData);
                jumlahUser.setText(String.valueOf(jumlahDataUser));
                        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getJumlahProduk() {
        Connection con = Koneksi.Go();

        String query = "SELECT COUNT(*) AS jumlah_data FROM produk";

        try {
             PreparedStatement stmt = con.prepareStatement(query);
             ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                String jumlahDataProduk = rs.getString("jumlah_data");
//              System.out.println("Jumlah data di tabel akun: " + jumlahData);
                jumlahProduk.setText(String.valueOf(jumlahDataProduk));
                        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
