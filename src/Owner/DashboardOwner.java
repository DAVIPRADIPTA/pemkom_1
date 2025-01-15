/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Owner;

import app.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class DashboardOwner extends javax.swing.JPanel {

    /**
     * Creates new form DashboardOwner
     */
    String produkTerlaris;
    int jumlahTerjual;
    double totalPenjualan;
    public DashboardOwner() {
        initComponents();
        getJumlahUser();
        getJumlahProduk();
        loadProdukTerlarisBulanIni();
        loadPendapatanBulanIni();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jumlahUser = new javax.swing.JLabel();
        USER1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jumlahProduk = new javax.swing.JLabel();
        USER = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProdukTerlaris = new javax.swing.JLabel();
        lblTotalTerjual = new javax.swing.JLabel();
        lblTotalPendapatan = new javax.swing.JLabel();
        tglDari = new com.toedter.calendar.JDateChooser();
        tglSampai = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblTotalPendapatan3 = new javax.swing.JLabel();
        tglDariPendapatan1 = new com.toedter.calendar.JDateChooser();
        tglSampaiPendapatan1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jumlahUser.setBackground(new java.awt.Color(102, 102, 102));
        jumlahUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jumlahUser.setForeground(new java.awt.Color(255, 255, 255));
        jumlahUser.setText("jLabel1");

        USER1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        USER1.setForeground(new java.awt.Color(255, 255, 255));
        USER1.setText("USER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(USER1)
                    .addComponent(jumlahUser))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(USER1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        USER.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        USER.setForeground(new java.awt.Color(255, 255, 255));
        USER.setText("PRODUK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(USER)
                    .addComponent(jumlahProduk))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(USER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahProduk)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Produk terlaris");

        lblProdukTerlaris.setText("jLabel2");

        lblTotalTerjual.setText("jLabel2");

        lblTotalPendapatan.setText("jLabel2");

        jLabel2.setText("dari");

        jLabel3.setText("sampai");

        jButton1.setText("view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Secara default menampikan produk terlaris bulan ini");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdukTerlaris)
                            .addComponent(lblTotalTerjual)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tglDari, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(tglSampai, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addContainerGap())))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblTotalPendapatan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)
                        .addGap(82, 82, 82))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tglSampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tglDari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(lblTotalTerjual)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalPendapatan)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProdukTerlaris)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        lblTotalPendapatan3.setText("jLabel6");

        jLabel10.setText("Sampai");

        jLabel11.setText("Dari");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Total Pendapatn");

        jButton7.setText("view");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Secara default menampikan total pendapatan bulan ini");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalPendapatan3)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tglDariPendapatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tglSampaiPendapatan1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButton8)
                        .addGap(45, 45, 45)
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(77, 77, 77))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tglDariPendapatan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalPendapatan3)
                            .addComponent(tglSampaiPendapatan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loadProdukTerlarisCustomPeriode();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loadProdukTerlarisBulanIni();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        loadPendapatanCustomPeriode();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        loadPendapatanBulanIni();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel USER;
    private javax.swing.JLabel USER1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jumlahProduk;
    private javax.swing.JLabel jumlahUser;
    private javax.swing.JLabel lblProdukTerlaris;
    private javax.swing.JLabel lblTotalPendapatan;
    private javax.swing.JLabel lblTotalPendapatan3;
    private javax.swing.JLabel lblTotalTerjual;
    private com.toedter.calendar.JDateChooser tglDari;
    private com.toedter.calendar.JDateChooser tglDariPendapatan1;
    private com.toedter.calendar.JDateChooser tglSampai;
    private com.toedter.calendar.JDateChooser tglSampaiPendapatan1;
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
                int jumlahDataProduk = rs.getInt("jumlah_data");
//              System.out.println("Jumlah data di tabel akun: " + jumlahData);
                jumlahProduk.setText(String.valueOf(jumlahDataProduk));
                        
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadProdukTerlarisBulanIni() {
    try {
        Connection conn = Koneksi.Go();

        // Ambil tanggal awal dan akhir bulan ini
        LocalDate now = LocalDate.now();
        String tanggalAwal = now.withDayOfMonth(1).toString(); // Tanggal 1 bulan ini
        String tanggalAkhir = now.withDayOfMonth(now.lengthOfMonth()).toString(); // Tanggal terakhir bulan ini

        String sql = "SELECT " +
                     "p.nama_produk AS produk_terlaris, " +
                     "SUM(d.jumlah_produk) AS jumlah_terjual, " +
                     "SUM(d.jumlah_produk * p.harga_jual) AS total_penjualan " +
                     "FROM transaksi_detail d " +
                     "JOIN produk p ON d.id_produk = p.id_produk " +
                     "JOIN transaksi t ON d.id_transaksi = t.id_transaksi " +
                     "WHERE t.tanggal_transaksi >= ? AND t.tanggal_transaksi <= ? " +
                     "GROUP BY p.nama_produk " +
                     "ORDER BY jumlah_terjual DESC " +
                     "LIMIT 1";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, tanggalAwal);
        stmt.setString(2, tanggalAkhir);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            produkTerlaris = rs.getString("produk_terlaris");
            jumlahTerjual = rs.getInt("jumlah_terjual");
            totalPenjualan = rs.getDouble("total_penjualan");
            
            loadData();

        } else {
            JOptionPane.showMessageDialog(this, "Tidak ada data produk terlaris untuk bulan ini.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }

        rs.close();
        stmt.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data produk terlaris bulan ini!", "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }}
    private void loadProdukTerlarisCustomPeriode() {
        java.util.Date dateFrom = tglDari.getDate();
        java.util.Date dateTo = tglSampai.getDate();

        if (dateFrom == null || dateTo == null) {
            JOptionPane.showMessageDialog(this, "Harap pilih tanggal awal dan tanggal akhir!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Format tanggal ke bentuk SQL (yyyy-MM-dd)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dariTanggal = sdf.format(dateFrom);
        String sampaiTanggal = sdf.format(dateTo);


        try {
            Connection conn = Koneksi.Go();

            String sql = "SELECT " +
                         "p.nama_produk AS produk_terlaris, " +
                         "SUM(d.jumlah_produk) AS jumlah_terjual, " +
                         "SUM(d.jumlah_produk * p.harga_jual) AS total_penjualan " +
                         "FROM transaksi_detail d " +
                         "JOIN produk p ON d.id_produk = p.id_produk " +
                         "JOIN transaksi t ON d.id_transaksi = t.id_transaksi " +
                         "WHERE t.tanggal_transaksi >= ? AND t.tanggal_transaksi <= ? " +
                         "GROUP BY p.nama_produk " +
                         "ORDER BY jumlah_terjual DESC " +
                         "LIMIT 1";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, dariTanggal);
            stmt.setString(2, sampaiTanggal);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                produkTerlaris = rs.getString("produk_terlaris");
                jumlahTerjual = rs.getInt("jumlah_terjual");
                totalPenjualan = rs.getDouble("total_penjualan");
                
                loadData();

            } else {
                JOptionPane.showMessageDialog(this, "Tidak ada data produk terlaris untuk periode ini.", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data produk terlaris!", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    private void loadData() {
            lblProdukTerlaris.setText(produkTerlaris);
            lblTotalTerjual.setText(jumlahTerjual+" terjual");
            lblTotalPendapatan.setText(String.format("Rp %, .2f", totalPenjualan));    
    }

    private void loadPendapatanBulanIni() {
    LocalDate now = LocalDate.now();
    LocalDate startOfMonth = now.withDayOfMonth(1); // Tanggal 1 bulan ini
    LocalDate today = now; // Hari ini

    // Format ke bentuk SQL (yyyy-MM-dd)
    String dariTanggal = startOfMonth.toString();
    String sampaiTanggal = today.toString();
    try {
        Connection conn = Koneksi.Go();

        String sql = "SELECT SUM(d.jumlah_produk * p.harga_jual) AS total_pendapatan " +
                     "FROM transaksi_detail d " +
                     "JOIN produk p ON d.id_produk = p.id_produk " +
                     "JOIN transaksi t ON d.id_transaksi = t.id_transaksi " +
                     "WHERE t.tanggal_transaksi >= ? AND t.tanggal_transaksi <= ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, dariTanggal);
        stmt.setString(2, sampaiTanggal);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            double totalPendapatan = rs.getDouble("total_pendapatan");
            lblTotalPendapatan3.setText(String.format("Rp %, .2f", totalPendapatan)); // Format untuk ditampilkan
        } else {
            lblTotalPendapatan3.setText("Rp 0");
        }

        rs.close();
        stmt.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data pendapatan!", "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }}
    
    private void loadPendapatanCustomPeriode() {
    java.util.Date dateFrom = tglDariPendapatan1.getDate();
    java.util.Date dateTo = tglSampaiPendapatan1.getDate();

    if (dateFrom == null || dateTo == null) {
        JOptionPane.showMessageDialog(this, "Harap pilih tanggal awal dan tanggal akhir!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Format tanggal ke bentuk SQL (yyyy-MM-dd)
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dariTanggal = sdf.format(dateFrom);
    String sampaiTanggal = sdf.format(dateTo);

    try {
        Connection conn = Koneksi.Go();

        String sql = "SELECT SUM(d.jumlah_produk * p.harga_jual) AS total_pendapatan " +
                     "FROM transaksi_detail d " +
                     "JOIN produk p ON d.id_produk = p.id_produk " +
                     "JOIN transaksi t ON d.id_transaksi = t.id_transaksi " +
                     "WHERE t.tanggal_transaksi >= ? AND t.tanggal_transaksi <= ?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, dariTanggal);
        stmt.setString(2, sampaiTanggal);

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            double totalPendapatan = rs.getDouble("total_pendapatan");
            lblTotalPendapatan3.setText(String.format("Rp %, .2f", totalPendapatan)); // Format untuk ditampilkan
        } else {
            lblTotalPendapatan3.setText("Rp 0");
        }

        rs.close();
        stmt.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Gagal memuat data pendapatan!", "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }}
}
