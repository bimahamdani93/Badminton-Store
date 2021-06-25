package Objek;

import Database.Koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Shuttlecock extends PerlengkapanBadminton {

    
    //overloading
    public void setTotalHarga(int harga, int jumlah, int ongkir) {
        int total;
        total = ((harga * jumlah) + ongkir);
        super.setTotalHarga(total);
    }

    
    @Override
    public void insert() {
        try {

            String url = "INSERT INTO shuttlecock VALUES (?,?,?,?,?,?,?,?,?)";
            java.sql.Connection conn = (Connection) Koneksi.configDB();                      //MENGKONEKSIKAN KE DATABASE
            java.sql.PreparedStatement stm = conn.prepareStatement(url);                     //MEMBUAT STATEMENT DATABASE
            stm.setString(1, getMerk());
            stm.setInt(2, getHarga());
            stm.setInt(3, getJumlah());
            stm.setString(4, getJasaKirim());
            stm.setInt(5, getOngkir());
            stm.setInt(6, getTotalHarga());
            stm.setString(7, getPembayaran());
            stm.setString(8, getStatusPengiriman());
            stm.setString(9, getIdBarang());

            stm.execute();                                                                  

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");                      
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pastikan Form Terisi Semua!!!");
        }
    }

    
    @Override
    public void delete() {
        try {

            int answer = JOptionPane.showConfirmDialog 
                    (null, "Anda Yakin Ingin Membatalkan Pesanan", "Cancel", JOptionPane.YES_OPTION);                       
            if (answer == JOptionPane.YES_OPTION) {                                                             
                String url = "DELETE From shuttlecock WHERE IDBarang = '" + getIdBarang() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                              
                PreparedStatement stm = conn.prepareStatement(url);
                stm.execute();
                JOptionPane.showMessageDialog(null, "Pesanan Berhasil Dibatalkan");                                                   
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Pesanan tidak bisa dibatalkan");
        }
    }

   
    @Override
    public void update() {
        try {

            {
                String url = "UPDATE shuttlecock SET Merk=?, Harga=?, JumlahBarang=?,JasaKirim=?,"
                        + " Ongkir=?, TotalHarga=?, Pembayaran=?, StatusPengiriman=?, IDBarang=?"
                        + "WHERE IDBarang = '" + getIdBarang() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                          
                PreparedStatement stm = conn.prepareStatement(url);
                stm.setString(1, getMerk());
                stm.setInt(2, getHarga());
                stm.setInt(3, getJumlah());
                stm.setString(4, getJasaKirim());
                stm.setInt(5, getOngkir());
                stm.setInt(6, getTotalHarga());
                stm.setString(7, getPembayaran());
                stm.setString(8, getStatusPengiriman());
                stm.setString(9, getIdBarang());

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
            String sql = "SELECT * FROM shuttlecock WHERE IDBarang = '" + getIdBarang() + "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {

                setMerk(rs.getString("Merk"));
                setHarga(rs.getInt("Harga"));
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
        String cetak = ("\n" + "Merk Shuttlecock\t:  " + getMerk() + "\n"
                + "Harga\t\t:  " + getHarga() + "\n"
                + "Jumlah Barang\t\t:  " + getJumlah() + "\n"
                + "Jasa Pengiriman\t:  " + getJasaKirim() + "\n"
                + "Ongkir\t\t:  " + getOngkir() + "\n"
                + "Total Harga\t\t:  " + getTotalHarga() + "\n"
                + "Metode Pembayaran\t:  " + getPembayaran() + "\n"
                + "Status Pengiriman\t:  " + getStatusPengiriman()+ "\n"
                + "ID Barang\t\t:  " + getIdBarang() + "\n\n"
                + "#########################################\n"
                + "**TERIMAKASIH TELAH MEMBELI SHUTTLECOCK DI TOKO KAMI**");
        return cetak;
    }
}
