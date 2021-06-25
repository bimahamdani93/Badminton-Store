package GUI;

import Objek.*;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Bima Hamdani Mawaridi
 */
public class GUI_Confirmation extends javax.swing.JFrame {

    DataPembeli dataPembeli = new DataPembeli();                                                //Membuat objek dari class DataPembeli
    GUI_MainMenu mMenu = new GUI_MainMenu();
    Image images;                                                                               //menyimpan alamat file yg dipilih
    String path;
    private String namabarang;

    
    /**
     * Creates new form GUI_Konfirmasi
     */
    public GUI_Confirmation() {
        initComponents();
        jTA_RincianPesanan.setEditable(false);
    }

    public void cetak() {

        dataPembeli.setNama(jT_Nama.getText());
        dataPembeli.cari();

        PerlengkapanBadminton[] perlengkapan = new PerlengkapanBadminton[4];

        perlengkapan[0] = new Raket();
        perlengkapan[1] = new Jersey();
        perlengkapan[2] = new Shuttlecock();
        perlengkapan[3] = new Sepatu();

        switch (namabarang) {
            case "Raket":
                perlengkapan[0].setIdBarang(jT_IDbarang.getText());
                perlengkapan[0].search();
                perlengkapan[0].setStatusPengiriman("Sudah Dikirim");
                perlengkapan[0].update();
                jTA_RincianPesanan.setText(dataPembeli.cetak() + perlengkapan[0].print());
                break;
            case "Jersey":
                perlengkapan[1].setIdBarang(jT_IDbarang.getText());
                perlengkapan[1].search();
                perlengkapan[1].setStatusPengiriman("Sudah Dikirim");
                perlengkapan[1].update();
                jTA_RincianPesanan.setText(dataPembeli.cetak() + perlengkapan[1].print());
                break;
            case "Shuttlecock":
                perlengkapan[2].setIdBarang(jT_IDbarang.getText());
                perlengkapan[2].search();
                perlengkapan[2].setStatusPengiriman("Sudah Dikirim");
                perlengkapan[2].update();
                jTA_RincianPesanan.setText(dataPembeli.cetak() + perlengkapan[2].print());
                break;
            case "Sepatu":
                perlengkapan[3].setIdBarang(jT_IDbarang.getText());
                perlengkapan[3].search();
                perlengkapan[3].setStatusPengiriman("Sudah Dikirim");
                perlengkapan[3].update();
                jTA_RincianPesanan.setText(dataPembeli.cetak() + perlengkapan[3].print());
                break;
            default:
                break;
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

        jPanel1 = new javax.swing.JPanel();
        jL_Silahkan = new javax.swing.JLabel();
        jL_Nama = new javax.swing.JLabel();
        jL_IDBarang = new javax.swing.JLabel();
        jL_NamaBarang = new javax.swing.JLabel();
        jL_Upload = new javax.swing.JLabel();
        jL_Bukti = new javax.swing.JLabel();
        jC_NamaBarang = new javax.swing.JComboBox<>();
        jT_Nama = new javax.swing.JTextField();
        jT_IDbarang = new javax.swing.JTextField();
        jT_NamaFile = new javax.swing.JTextField();
        jB_Kembali1 = new javax.swing.JButton();
        jB_Pilih = new javax.swing.JButton();
        jB_Confirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_RincianPesanan = new javax.swing.JTextArea();
        jPanel_GarisAtas = new javax.swing.JPanel();
        jPanel_Bukti = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jL_BuktiPembayaran = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 400));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(102, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jL_Silahkan.setFont(new java.awt.Font("Meiryo UI", 1, 16)); // NOI18N
        jL_Silahkan.setForeground(new java.awt.Color(0, 0, 0));
        jL_Silahkan.setText("Silahkan Konfirmasi Pembayaran Anda ");
        jPanel1.add(jL_Silahkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 350, 30));

        jL_Nama.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_Nama.setForeground(new java.awt.Color(0, 0, 0));
        jL_Nama.setText("Nama");
        jPanel1.add(jL_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jL_IDBarang.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_IDBarang.setForeground(new java.awt.Color(0, 0, 0));
        jL_IDBarang.setText("ID Barang");
        jPanel1.add(jL_IDBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jL_NamaBarang.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_NamaBarang.setForeground(new java.awt.Color(0, 0, 0));
        jL_NamaBarang.setText("Nama Barang");
        jPanel1.add(jL_NamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jL_Upload.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jL_Upload.setForeground(new java.awt.Color(0, 0, 0));
        jL_Upload.setText("Upload Bukti Pembayaran Anda");
        jPanel1.add(jL_Upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jL_Bukti.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jL_Bukti.setForeground(new java.awt.Color(0, 0, 0));
        jL_Bukti.setText("Bukti Pembayaran");
        jPanel1.add(jL_Bukti, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jC_NamaBarang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Raket", "Shuttlecock", "Jersey", "Sepatu" }));
        jC_NamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_NamaBarangActionPerformed(evt);
            }
        });
        jPanel1.add(jC_NamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 100, -1));

        jT_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_NamaActionPerformed(evt);
            }
        });
        jPanel1.add(jT_Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 130, -1));
        jPanel1.add(jT_IDbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 90, -1));

        jT_NamaFile.setEditable(false);
        jPanel1.add(jT_NamaFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, -1));

        jB_Kembali1.setText("Kembali");
        jB_Kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Kembali1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jB_Pilih.setText("Pilih");
        jB_Pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_PilihActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jB_Confirm.setText("Konfirmasi");
        jB_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jTA_RincianPesanan.setColumns(20);
        jTA_RincianPesanan.setRows(5);
        jScrollPane1.setViewportView(jTA_RincianPesanan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 50, 370, 350));

        javax.swing.GroupLayout jPanel_GarisAtasLayout = new javax.swing.GroupLayout(jPanel_GarisAtas);
        jPanel_GarisAtas.setLayout(jPanel_GarisAtasLayout);
        jPanel_GarisAtasLayout.setHorizontalGroup(
            jPanel_GarisAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel_GarisAtasLayout.setVerticalGroup(
            jPanel_GarisAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel_GarisAtas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, 10));

        jScrollPane2.setViewportView(jL_BuktiPembayaran);

        javax.swing.GroupLayout jPanel_BuktiLayout = new javax.swing.GroupLayout(jPanel_Bukti);
        jPanel_Bukti.setLayout(jPanel_BuktiLayout);
        jPanel_BuktiLayout.setHorizontalGroup(
            jPanel_BuktiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel_BuktiLayout.setVerticalGroup(
            jPanel_BuktiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel_Bukti, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jT_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_NamaActionPerformed

    private void jB_PilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_PilihActionPerformed
        JFileChooser pilih = new JFileChooser(System.getProperty("user.home"));                           //membuka penyimpanan komputer kita
        pilih.setFileSelectionMode(JFileChooser.FILES_ONLY);                                              //untuk memilih file
        pilih.setFileFilter(new FileNameExtensionFilter("jpg|png", "jpg", "PNG"));                        //mengatur tipe file yg dapat dilihat
        if (pilih.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {                                                                 //Set foto ke jlabel
            File file = pilih.getSelectedFile();
            try {
                if (file.length() > 305000) {                                                             //jika file lebih dari 205000 bytes
                    JOptionPane.showMessageDialog(rootPane, "Ukuran gambar terlalu besar", "Max 200kb", JOptionPane.WARNING_MESSAGE);
                } else {
                    images = ImageIO.read(file);                                                          //membaca file
                    ImageIcon icon = new ImageIcon(images);                                                                  //merubah ke icon
                    jL_BuktiPembayaran.setIcon(icon);
                    path = file.getAbsolutePath();                                                        //mengubah gambar ke byte
                }
            } catch (Exception e) {

            }
            jT_NamaFile.setText(file.getName());
        }

    }//GEN-LAST:event_jB_PilihActionPerformed

    private void jC_NamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_NamaBarangActionPerformed

        if (jC_NamaBarang.getSelectedItem().equals("Raket")) {
            namabarang = "Raket";
        } else if (jC_NamaBarang.getSelectedItem().equals("Jersey")) {
            namabarang = "Jersey";
        } else if (jC_NamaBarang.getSelectedItem().equals("Shuttlecock")) {
            namabarang = "Shuttlecock";
        } else if (jC_NamaBarang.getSelectedItem().equals("Sepatu")) {
            namabarang = "Sepatu";
        }
    }//GEN-LAST:event_jC_NamaBarangActionPerformed

    private void jB_Kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Kembali1ActionPerformed
        mMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jB_Kembali1ActionPerformed

    private void jB_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ConfirmActionPerformed
        if (jT_NamaFile.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pastikan Bukti Pembayaran Telah Diupload");
        }
        else {
            cetak();
        }
    }//GEN-LAST:event_jB_ConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Confirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Confirm;
    private javax.swing.JButton jB_Kembali1;
    private javax.swing.JButton jB_Pilih;
    private javax.swing.JComboBox<String> jC_NamaBarang;
    private javax.swing.JLabel jL_Bukti;
    private javax.swing.JLabel jL_BuktiPembayaran;
    private javax.swing.JLabel jL_IDBarang;
    private javax.swing.JLabel jL_Nama;
    private javax.swing.JLabel jL_NamaBarang;
    private javax.swing.JLabel jL_Silahkan;
    private javax.swing.JLabel jL_Upload;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Bukti;
    private javax.swing.JPanel jPanel_GarisAtas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTA_RincianPesanan;
    private javax.swing.JTextField jT_IDbarang;
    private javax.swing.JTextField jT_Nama;
    private javax.swing.JTextField jT_NamaFile;
    // End of variables declaration//GEN-END:variables
}