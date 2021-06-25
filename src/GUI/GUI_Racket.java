package GUI;

import Objek.Raket;

/**
 *
 * @author Bima Hamdani Mawaridi
 */
public class GUI_Racket extends javax.swing.JFrame {

    Raket raket = new Raket();                                                                              //membuat objek referensi dari class Raket

    public GUI_Racket() {
        initComponents();
        jT_Harga1.setEditable(false);
        jT_Ongkir1.setEditable(false);
        jT_Total1.setEditable(false);
        jTA_Cetak1.setEditable(false);
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
        jC_Merk1 = new javax.swing.JComboBox<>();
        jC_JenisGrip1 = new javax.swing.JComboBox<>();
        jC_Pembayaran1 = new javax.swing.JComboBox<>();
        jC_JasaKirim1 = new javax.swing.JComboBox<>();
        jL_Jumlah = new javax.swing.JLabel();
        jL_IDbarang = new javax.swing.JLabel();
        jL_Merk = new javax.swing.JLabel();
        jL_JenisGrip = new javax.swing.JLabel();
        jL_Harga = new javax.swing.JLabel();
        jL_Total = new javax.swing.JLabel();
        jL_JasaKirim = new javax.swing.JLabel();
        jL_Ongkir = new javax.swing.JLabel();
        jL_Pembayaran = new javax.swing.JLabel();
        jP_Silahkan = new javax.swing.JPanel();
        Silahkan = new javax.swing.JLabel();
        jT_Harga1 = new javax.swing.JTextField();
        jT_Jumlah1 = new javax.swing.JTextField();
        jT_Ongkir1 = new javax.swing.JTextField();
        jT_Total1 = new javax.swing.JTextField();
        jT_IDbarang1 = new javax.swing.JTextField();
        jB_Kembali1 = new javax.swing.JButton();
        jB_Beli1 = new javax.swing.JButton();
        jB_Ubah1 = new javax.swing.JButton();
        jB_Cetak1 = new javax.swing.JButton();
        jB_Batal1 = new javax.swing.JButton();
        jL_Background = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_Cetak1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 355));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 355));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jC_Merk1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Li Ning", "Victor", "Yonex", "Astec", "Wilson" }));
        jC_Merk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_Merk1ActionPerformed(evt);
            }
        });
        jPanel1.add(jC_Merk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 80, -1));

        jC_JenisGrip1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Handuk", "Karet" }));
        jC_JenisGrip1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_JenisGrip1ActionPerformed(evt);
            }
        });
        jC_JenisGrip1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jC_JenisGrip1KeyReleased(evt);
            }
        });
        jPanel1.add(jC_JenisGrip1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 80, -1));

        jC_Pembayaran1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Transfer", "COD", "Indomaret", "OVO" }));
        jC_Pembayaran1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_Pembayaran1ActionPerformed(evt);
            }
        });
        jPanel1.add(jC_Pembayaran1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 90, -1));

        jC_JasaKirim1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "J&T Express", "JNE", "Tiki", "Wahana Express", "Ninja Express" }));
        jC_JasaKirim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jC_JasaKirim1ActionPerformed(evt);
            }
        });
        jPanel1.add(jC_JasaKirim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        jL_Jumlah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_Jumlah.setForeground(new java.awt.Color(204, 255, 255));
        jL_Jumlah.setText("Jumlah Barang");
        jPanel1.add(jL_Jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, 20));

        jL_IDbarang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_IDbarang.setForeground(new java.awt.Color(204, 255, 255));
        jL_IDbarang.setText("ID Barang");
        jPanel1.add(jL_IDbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, 20));

        jL_Merk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_Merk.setForeground(new java.awt.Color(204, 255, 255));
        jL_Merk.setText("Merk");
        jPanel1.add(jL_Merk, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 20));

        jL_JenisGrip.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_JenisGrip.setForeground(new java.awt.Color(204, 255, 255));
        jL_JenisGrip.setText("Jenis Grip");
        jPanel1.add(jL_JenisGrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        jL_Harga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_Harga.setForeground(new java.awt.Color(204, 255, 255));
        jL_Harga.setText("Harga");
        jPanel1.add(jL_Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 40));

        jL_Total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_Total.setForeground(new java.awt.Color(204, 255, 255));
        jL_Total.setText("Total Harga");
        jPanel1.add(jL_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, 20));

        jL_JasaKirim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_JasaKirim.setForeground(new java.awt.Color(204, 255, 255));
        jL_JasaKirim.setText("Jasa Kirim");
        jPanel1.add(jL_JasaKirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, 20));

        jL_Ongkir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_Ongkir.setForeground(new java.awt.Color(204, 255, 255));
        jL_Ongkir.setText("Ongkir");
        jPanel1.add(jL_Ongkir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, 20));

        jL_Pembayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jL_Pembayaran.setForeground(new java.awt.Color(204, 255, 255));
        jL_Pembayaran.setText("Pembayaran");
        jPanel1.add(jL_Pembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        jP_Silahkan.setBackground(new java.awt.Color(51, 32, 207));
        jP_Silahkan.setForeground(new java.awt.Color(0, 0, 255));

        Silahkan.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        Silahkan.setForeground(new java.awt.Color(255, 255, 0));
        Silahkan.setText("Silahkan Pesan Raket Terbaik Anda");

        javax.swing.GroupLayout jP_SilahkanLayout = new javax.swing.GroupLayout(jP_Silahkan);
        jP_Silahkan.setLayout(jP_SilahkanLayout);
        jP_SilahkanLayout.setHorizontalGroup(
            jP_SilahkanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_SilahkanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Silahkan)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jP_SilahkanLayout.setVerticalGroup(
            jP_SilahkanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_SilahkanLayout.createSequentialGroup()
                .addComponent(Silahkan)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.add(jP_Silahkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 290, 20));

        jT_Harga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Harga1ActionPerformed(evt);
            }
        });
        jPanel1.add(jT_Harga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 90, -1));

        jT_Jumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_Jumlah1ActionPerformed(evt);
            }
        });
        jT_Jumlah1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jT_Jumlah1KeyReleased(evt);
            }
        });
        jPanel1.add(jT_Jumlah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 90, -1));
        jPanel1.add(jT_Ongkir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 90, -1));
        jPanel1.add(jT_Total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 90, -1));
        jPanel1.add(jT_IDbarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 90, -1));

        jB_Kembali1.setText("Kembali");
        jB_Kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Kembali1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Kembali1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jB_Beli1.setText("Beli");
        jB_Beli1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Beli1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Beli1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 80, -1));

        jB_Ubah1.setText("Ubah Pesanan");
        jB_Ubah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Ubah1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Ubah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jB_Cetak1.setText("Cetak Struk");
        jB_Cetak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Cetak1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Cetak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jB_Batal1.setText("Batalkan Pesanan");
        jB_Batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Batal1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB_Batal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jL_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Bg_Raket.png"))); // NOI18N
        jPanel1.add(jL_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 618, 355);

        jTA_Cetak1.setColumns(20);
        jTA_Cetak1.setRows(5);
        jScrollPane1.setViewportView(jTA_Cetak1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(618, 0, 290, 355);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jC_Merk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_Merk1ActionPerformed

        if (jC_Merk1.getSelectedItem().equals("Li Ning")) {                                             //JIKA COMBO BOX YANG DIPILIH Li Ning MAKA
            raket.setMerk("Li Ning");                                                                   //NILAI Variabel Merk Li Ning
            raket.setHarga(450000);                                                                     //Memberi Nilai Variabel harga
        } else if (jC_Merk1.getSelectedItem().equals("Victor")) {                                
            raket.setMerk("Victor");                                                            
            raket.setHarga(620000);
        } else if (jC_Merk1.getSelectedItem().equals("Yonex")) {                                 
            raket.setMerk("Yonex");                                                                
            raket.setHarga(950000);
        } else if (jC_Merk1.getSelectedItem().equals("Astec")) {                                 
            raket.setMerk("Astec");                                                                
            raket.setHarga(410000);
        } else if (jC_Merk1.getSelectedItem().equals("Wilson")) {                                
            raket.setMerk("Wilson");                                                               
            raket.setHarga(300000);
        }

    }//GEN-LAST:event_jC_Merk1ActionPerformed

    private void jB_Kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Kembali1ActionPerformed
        GUI_MainMenu main = new GUI_MainMenu();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jB_Kembali1ActionPerformed

    private void jC_JenisGrip1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_JenisGrip1ActionPerformed
        int harga = 0;
        if (jC_JenisGrip1.getSelectedItem().equals("Handuk")) {                                      //JIKA COMBO BOX YANG DIPILIH Handuk 
            raket.setJenisGrip("Handuk");
            raket.setHargaGrip(5000);
            harga = raket.getHarga() + raket.getHargaGrip();
        } else if (jC_JenisGrip1.getSelectedItem().equals("Karet")) {                                //JIKA COMBO BOX YANG DIPILIH Karet 
            raket.setJenisGrip("Karet");
            raket.setHargaGrip(10000);
            harga = raket.getHarga() + raket.getHargaGrip();
        }
        jT_Harga1.setText("" + harga);           
    }//GEN-LAST:event_jC_JenisGrip1ActionPerformed

    private void jC_JenisGrip1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jC_JenisGrip1KeyReleased

    }//GEN-LAST:event_jC_JenisGrip1KeyReleased

    private void jT_Jumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Jumlah1ActionPerformed
       
    }//GEN-LAST:event_jT_Jumlah1ActionPerformed

    private void jT_Jumlah1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_Jumlah1KeyReleased
        int jml = Integer.parseInt(jT_Jumlah1.getText());                
        raket.setJumlah(jml);                                                                                   //Menyimpan nilai pada textfield jumlah ke variabel jumlah
        raket.setTotalHarga(raket.getHarga(), raket.getHargaGrip(), raket.getJumlah(), raket.getOngkir());
        jT_Total1.setText("" + raket.getTotalHarga());
    }//GEN-LAST:event_jT_Jumlah1KeyReleased

    private void jB_Beli1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Beli1ActionPerformed
        raket.setIdBarang(jT_IDbarang1.getText());
        
        raket.insert();
    }//GEN-LAST:event_jB_Beli1ActionPerformed

    private void jT_Harga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_Harga1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_Harga1ActionPerformed

    private void jB_Ubah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Ubah1ActionPerformed
        raket.setIdBarang(jT_IDbarang1.getText());
        raket.update();
    }//GEN-LAST:event_jB_Ubah1ActionPerformed

    private void jB_Batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Batal1ActionPerformed
        raket.setIdBarang(jT_IDbarang1.getText());
        raket.delete();
    }//GEN-LAST:event_jB_Batal1ActionPerformed

    private void jB_Cetak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Cetak1ActionPerformed
        jTA_Cetak1.setText(raket.print());

    }//GEN-LAST:event_jB_Cetak1ActionPerformed

    private void jC_Pembayaran1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_Pembayaran1ActionPerformed
        if (jC_Pembayaran1.getSelectedItem().equals("Transfer")) {
            raket.setPembayaran("Transfer");
            raket.setStatusPengiriman("Belum Dikirim");
        } else if (jC_Pembayaran1.getSelectedItem().equals("COD")) {
            raket.setPembayaran("COD");
            raket.setStatusPengiriman("Dikirim 2 Hari Lagi");
        } else if (jC_Pembayaran1.getSelectedItem().equals("Indomaret")) {
            raket.setPembayaran("Indomaret");
            raket.setStatusPengiriman("Belum Dikirim");
        } else if (jC_Pembayaran1.getSelectedItem().equals("OVO")) {
            raket.setPembayaran("OVO");
            raket.setStatusPengiriman("Belum Dikirim");
        }
       
    }//GEN-LAST:event_jC_Pembayaran1ActionPerformed

    private void jC_JasaKirim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jC_JasaKirim1ActionPerformed
        if (jC_JasaKirim1.getSelectedItem().equals("J&T Express")) {
            raket.setJasaKirim("J&T Express");
            raket.setOngkir(19000);
        } else if (jC_JasaKirim1.getSelectedItem().equals("JNE")) {
            raket.setJasaKirim("JNE");
            raket.setOngkir(18000);
        } else if (jC_JasaKirim1.getSelectedItem().equals("Tiki")) {
            raket.setJasaKirim("Tiki");
            raket.setOngkir(15000);
        } else if (jC_JasaKirim1.getSelectedItem().equals("Wahana Express")) {
            raket.setJasaKirim("Wahana Express");
            raket.setOngkir(16000); 
        } else if (jC_JasaKirim1.getSelectedItem().equals("Ninja Express")) {
            raket.setJasaKirim("Ninja Express");
            raket.setOngkir(12000); 
        }
        
        jT_Ongkir1.setText("" + raket.getOngkir());
    }//GEN-LAST:event_jC_JasaKirim1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Racket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Racket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Racket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Racket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Racket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Silahkan;
    private javax.swing.JButton jB_Batal1;
    private javax.swing.JButton jB_Beli1;
    private javax.swing.JButton jB_Cetak1;
    private javax.swing.JButton jB_Kembali1;
    private javax.swing.JButton jB_Ubah1;
    private javax.swing.JComboBox<String> jC_JasaKirim1;
    private javax.swing.JComboBox<String> jC_JenisGrip1;
    private javax.swing.JComboBox<String> jC_Merk1;
    private javax.swing.JComboBox<String> jC_Pembayaran1;
    private javax.swing.JLabel jL_Background;
    private javax.swing.JLabel jL_Harga;
    private javax.swing.JLabel jL_IDbarang;
    private javax.swing.JLabel jL_JasaKirim;
    private javax.swing.JLabel jL_JenisGrip;
    private javax.swing.JLabel jL_Jumlah;
    private javax.swing.JLabel jL_Merk;
    private javax.swing.JLabel jL_Ongkir;
    private javax.swing.JLabel jL_Pembayaran;
    private javax.swing.JLabel jL_Total;
    private javax.swing.JPanel jP_Silahkan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTA_Cetak1;
    private javax.swing.JTextField jT_Harga1;
    private javax.swing.JTextField jT_IDbarang1;
    private javax.swing.JTextField jT_Jumlah1;
    private javax.swing.JTextField jT_Ongkir1;
    private javax.swing.JTextField jT_Total1;
    // End of variables declaration//GEN-END:variables
}