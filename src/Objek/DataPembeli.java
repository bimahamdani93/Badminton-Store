package Objek;

import Database.Koneksi;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class DataPembeli {

    private String nama;
    private String tanggal;
    private String noTelepon;
    private String pulau;
    private String alamat;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    } 

    public String getPulau() {
        return pulau;
    }

    public void setPulau(String pulau) {
        this.pulau = pulau;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    public void simpan() {
        try {

            String url = "INSERT INTO datapembeli VALUES (?,?,?,?,?)";
            Connection conn = (Connection) Koneksi.configDB();                                          //MENGKONEKSIKAN KE DATABASE
            PreparedStatement stm = conn.prepareStatement(url);                                         //MEMBUAT STATEMENT DATABASE
            stm.setString(1, getNama());
            stm.setString(2, getTanggal());
            stm.setString(3, getNoTelepon());
            stm.setString(4, getPulau());
            stm.setString(5, getAlamat());

            stm.execute();                                                                              //MENGEKSEKUSI STATEMENT

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");                              //MENAMPILKAN JOPTION DENGAN TAMPILAN "DATA BERHASIL DISIMPAN"
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Gunakan Nama lain atau tekan tombol cari");
        }
    }

    
    public void hapus() {
        try {

            int answer = JOptionPane.showConfirmDialog                                                              //MENYIMPAN DATA OK OPTION KEDALAM VAR ANSWER
                    (null, "Apakah Anda ingin menghapus data?", "Delete", JOptionPane.YES_OPTION);                  //MENAMPILKAN JOPTIONPANE DAN MENANYAKAN APAKAH YAKIN UNTUK KELUAR?
            if (answer == JOptionPane.YES_OPTION) {                                                                 //JIKA USER MENEKAN OKE MAKA
                String url = "DELETE FROM datapembeli WHERE Nama = '" + getNama() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                                  //MENGKONEKSIKAN KE DATABASE
                PreparedStatement stm = conn.prepareStatement(url);
                stm.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");                                                   //TAMPILAN MENU UTAMA AKAN TERTUTUP
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    public void edit() {
        try {

            {
                String url = "UPDATE datapembeli SET Nama=?, Tanggal=?, NoTelp=?, Pulau=?, Alamat=? "
                        + "WHERE Nama = '" + getNama() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                          
                PreparedStatement stm = conn.prepareStatement(url);
                stm.setString(1, getNama());
                stm.setString(2, getTanggal());
                stm.setString(3, getNoTelepon());
                stm.setString(4, getPulau());
                stm.setString(5, getAlamat());

                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");                                                   
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Data belum terisi semua");
        }
    }

    
    public void cari() {
        try {
            String sql = "SELECT * FROM datapembeli WHERE Nama = '" + getNama() + "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {

                setNama(rs.getString("Nama"));
                setTanggal(rs.getString("Tanggal"));
                setNoTelepon(rs.getString("NoTelp"));
                setPulau(rs.getString("Pulau"));
                setAlamat(rs.getString("Alamat"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    public String cetak() {
        String cetak = ("\tRINCIAN PESANAN :  " + "\n"
                + "Nama\t\t:  " + getNama() + "\n"
                + "Tanggal\t\t:  " + getTanggal() + "\n"
                + "Nomer Telepon\t\t:  " + getNoTelepon() + "\n"
                + "Pulau\t\t:  " + getPulau() + "\n"
                + "Alamat\t\t:  " + getAlamat() + "\n");
        return cetak;
    }

}
