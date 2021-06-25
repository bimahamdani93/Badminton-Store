package Objek;

import java.sql.Connection;
import javax.swing.JOptionPane;
import Database.Koneksi;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Raket extends PerlengkapanBadminton {

    private String jenisGrip;
    private int hargaGrip;

    public int getHargaGrip() {
        return hargaGrip;
    }

    public void setHargaGrip(int hargaGrip) {
        this.hargaGrip = hargaGrip;
    }

    public String getJenisGrip() {
        return jenisGrip;
    }

    public void setJenisGrip(String jenisGrip) {
        this.jenisGrip = jenisGrip;
    }

    
    //overloading
    public void setTotalHarga(int harga, int hGrip, int jumlah, int ongkir) {
        int total;
        total = ((harga + hGrip) * jumlah + ongkir);
        super.setTotalHarga(total);
    }

    
    @Override
    public void insert() {

        try {

            String url = "INSERT INTO raket VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.Connection conn = (Connection) Koneksi.configDB();                      //MENGKONEKSIKAN KE DATABASE
            java.sql.PreparedStatement stm = conn.prepareStatement(url);                     //MEMBUAT STATEMENT DATABASE
            stm.setString(1, getMerk());
            stm.setInt(2, getHarga());
            stm.setString(3, getJenisGrip());
            stm.setInt(4, getHargaGrip());
            stm.setInt(5, getJumlah());
            stm.setString(6, getJasaKirim());
            stm.setInt(7, getOngkir());
            stm.setInt(8, getTotalHarga());
            stm.setString(9, getPembayaran());
            stm.setString(10, getStatusPengiriman());
            stm.setString(11, getIdBarang());

            stm.execute();                                                              //MENGEKSEKUSI STATEMENT

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");              //MENAMPILKAN JOPTION DENGAN TAMPILAN "DATA BERHASIL DISIMPAN"
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pastikan Form Terisi Semua!!!");
        }
    }

    
    @Override
    public void delete() {
        try {

            int answer = JOptionPane.showConfirmDialog                                                      //MENYIMPAN DATA OK OPTION KEDALAM VAR ANSWER
                    (null, "Anda Yakin Ingin Membatalkan Pesanan", "Cancel", JOptionPane.YES_OPTION);                       //MENAMPILKAN JOPTIONPANE DAN MENANYAKAN APAKAH YAKIN UNTUK KELUAR?
            if (answer == JOptionPane.YES_OPTION) {                                                             //JIKA USER MENEKAN OKE MAKA
                String url = "DELETE From raket WHERE IDBarang = '" + getIdBarang() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                              //MENGKONEKSIKAN KE DATABASE
                PreparedStatement stm = conn.prepareStatement(url);
                stm.execute();
                JOptionPane.showMessageDialog(null, "Pesanan Berhasil Dibatalkan");                                                   //TAMPILAN MENU UTAMA AKAN TERTUTUP
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesanan tidak bisa dibatalkan");
        }
    }

    
    @Override
    public void update() {
        try {

            {
                String url = "UPDATE raket SET Merk=?, Harga=?, JenisGrip=?, HargaGrip=?, JumlahBarang=?, JasaKirim=?, "
                        + "Ongkir=?, TotalHarga=?, Pembayaran=?, StatusPengiriman=?, IDBarang=?"
                        + "WHERE IDBarang = '" + getIdBarang() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                                          //MENGKONEKSIKAN KE DATABASE
                PreparedStatement stm = conn.prepareStatement(url);
                stm.setString(1, getMerk());
                stm.setInt(2, getHarga());
                stm.setString(3, getJenisGrip());
                stm.setInt(4, getHargaGrip());
                stm.setInt(5, getJumlah());
                stm.setString(6, getJasaKirim());
                stm.setInt(7, getOngkir());
                stm.setInt(8, getTotalHarga());
                stm.setString(9, getPembayaran());
                stm.setString(10, getStatusPengiriman());
                stm.setString(11, getIdBarang());

                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Pesanan Berhasil Diubah atau Dikonfirmasi");                                                   //TAMPILAN MENU UTAMA AKAN TERTUTUP
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Data belum terisi semua");
        }
    }

    
    @Override
    public void search() {
        try {
            String sql = "SELECT * FROM raket WHERE IDBarang = '" + getIdBarang() + "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {

                setMerk(rs.getString("Merk"));
                setHarga(rs.getInt("Harga"));
                setJenisGrip(rs.getString("JenisGrip"));
                setHargaGrip(rs.getInt("HargaGrip"));
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
        String cetak = ("\n" + "Merk Raket\t\t:  " + getMerk() + "\n"
                + "Harga\t\t:  " + getHarga() + "\n"
                + "Jenis Grip\t\t:  " + getJenisGrip() + "\n"
                + "Harga Grip\t\t:  " + getHargaGrip() + "\n"
                + "Jumlah Barang\t\t:  " + getJumlah() + "\n"
                + "Jasa Pengiriman\t:  " + getJasaKirim() + "\n"
                + "Ongkir\t\t:  " + getOngkir() + "\n"
                + "Total Harga\t\t:  " + getTotalHarga() + "\n"
                + "Metode Pembayaran\t:  " + getPembayaran() + "\n"
                + "Status Pengiriman\t:  " + getStatusPengiriman()+ "\n"
                + "ID Barang\t\t:  " + getIdBarang() + "\n\n"
                + "#########################################\n"
                + "**TERIMAKASIH TELAH MEMBELI RAKET DI TOKO KAMI**");
        return cetak;
    }
}
