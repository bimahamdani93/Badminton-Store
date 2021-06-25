package Objek;

import Database.Koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Sepatu extends PerlengkapanBadminton {

    private String nomor;
    private String warna;
    private int harganomor;

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarganomor() {
        return harganomor;
    }

    public void setHarganomor(int harganomor) {
        this.harganomor = harganomor;
    }

    
    //overloading
    public void setTotalHarga(int harga, int hNomor, int jumlah, int ongkir) {
        int total;
        total = ((harga + hNomor) * jumlah + ongkir);
        super.setTotalHarga(total);
    }

    
    @Override
    public void insert() {

        try {

            String url = "INSERT INTO sepatu VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.Connection conn = (Connection) Koneksi.configDB();                      //MENGKONEKSIKAN KE DATABASE
            java.sql.PreparedStatement stm = conn.prepareStatement(url);                     //MEMBUAT STATEMENT DATABASE
            stm.setString(1, getMerk());
            stm.setInt(2, getHarga());
            stm.setString(3, getWarna());
            stm.setString(4, getNomor());
            stm.setInt(5, getHarganomor());
            stm.setInt(6, getJumlah());
            stm.setString(7, getJasaKirim());
            stm.setInt(8, getOngkir());
            stm.setInt(9, getTotalHarga());
            stm.setString(10, getPembayaran());
            stm.setString(11, getStatusPengiriman());
            stm.setString(12, getIdBarang());

            stm.execute();                                                              //MENGEKSEKUSI STATEMENT

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");              //MENAMPILKAN JOPTION DENGAN TAMPILAN "DATA BERHASIL DISIMPAN"
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pastikan Form Terisi Semua!!!");
        }
    }

    
    @Override
    public void delete() {
        try {

            int answer = JOptionPane.showConfirmDialog                                                                      //MENYIMPAN DATA OK OPTION KEDALAM VAR ANSWER
                    (null, "Anda Yakin Ingin Membatalkan Pesanan", "Cancel", JOptionPane.YES_OPTION);                       //MENAMPILKAN JOPTIONPANE DAN MENANYAKAN APAKAH YAKIN UNTUK KELUAR?
            if (answer == JOptionPane.YES_OPTION) {                                                                         //JIKA USER MENEKAN OKE MAKA
                String url = "DELETE From sepatu WHERE IDBarang = '" + getIdBarang() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                                          //MENGKONEKSIKAN KE DATABASE
                PreparedStatement stm = conn.prepareStatement(url);
                stm.execute();
                JOptionPane.showMessageDialog(null, "Pesanan Berhasil Dibatalkan");                                         //TAMPILAN MENU UTAMA AKAN TERTUTUP
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesanan tidak bisa dibatalkan");
        }
    }

    
    @Override
    public void update() {

        try {

            {
                String url = "UPDATE sepatu SET Merk=?, Harga=?, Warna=?, Nomor=?, HargaNomor=?, JumlahBarang=?, "
                        + "JasaKirim=?, Ongkir=?, TotalHarga=?, Pembayaran=?, StatusPengiriman=?, IDBarang=?"
                        + "WHERE IDBarang = '" + getIdBarang() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                         
                PreparedStatement stm = conn.prepareStatement(url);
                stm.setString(1, getMerk());
                stm.setInt(2, getHarga());
                stm.setString(3, getWarna());
                stm.setString(4, getNomor());
                stm.setInt(5, getHarganomor());
                stm.setInt(6, getJumlah());
                stm.setString(7, getJasaKirim());
                stm.setInt(8, getOngkir());
                stm.setInt(9, getTotalHarga());
                stm.setString(10, getPembayaran());
                stm.setString(11, getStatusPengiriman());
                stm.setString(12, getIdBarang());

                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Pesanan Berhasil Diubah atau Dikonfirmasi");                                                  
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Data belum terisi semua");
        }
    }

    
    @Override
    public void search() {
        try {
            String sql = "SELECT * FROM sepatu WHERE IDBarang = '" + getIdBarang() + "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {

                setMerk(rs.getString("Merk"));
                setHarga(rs.getInt("Harga"));
                setWarna(rs.getString("Warna"));
                setNomor(rs.getString("Nomor"));
                setHarganomor(rs.getInt("HargaNomor"));
                setJumlah(rs.getInt("JumlahBarang"));
                setJasaKirim(rs.getString("JasaKirim"));
                setOngkir(rs.getInt("Ongkir"));
                setTotalHarga(rs.getInt("TotalHarga"));
                setPembayaran(rs.getString("Pembayaran"));
                setStatusPengiriman(rs.getString("StatusPengiriman"));
                setIdBarang(rs.getString("IDBarang"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    @Override
    public String print() {
        String cetak = ("\n" + "Merk Sepatu\t\t:  " + getMerk() + "\n"
                + "Harga\t\t:  " + getHarga() + "\n"
                + "Warna\t\t:  " + getWarna() + "\n"
                + "Nomor Sepatu\t\t:  " + getNomor() + "\n"
                + "Jumlah Barang\t\t:  " + getJumlah() + "\n"
                + "Jasa Pengiriman\t:  " + getJasaKirim() + "\n"
                + "Ongkir\t\t:  " + getOngkir() + "\n"
                + "Total Harga\t\t:  " + getTotalHarga() + "\n"
                + "Metode Pembayaran\t:  " + getPembayaran() + "\n"
                + "Status Pengiriman\t:  " + getStatusPengiriman()+ "\n"
                + "ID Barang\t\t:  " + getIdBarang() + "\n\n"
                + "#########################################\n"
                + "**TERIMAKASIH TELAH MEMBELI SEPATU DI TOKO KAMI**");
        return cetak;
    }

}
