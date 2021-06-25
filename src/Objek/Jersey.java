package Objek;

import Database.Koneksi;
import java.awt.HeadlessException;
import java.sql.*;

import javax.swing.JOptionPane;

public class Jersey extends PerlengkapanBadminton {

    private String ukuran;
    private String namaPunggung;
    private int hargaUkuran;

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getNamaPunggung() {
        return namaPunggung;
    }

    public void setNamaPunggung(String NamaPunggung) {
        this.namaPunggung = NamaPunggung;
    }

    public int getHargaUkuran() {
        return hargaUkuran;
    }

    public void setHargaUkuran(int hargaUkuran) {
        this.hargaUkuran = hargaUkuran;
    }

    
    //overloading
    public void setTotalHarga(int harga, int hUkuran, int jumlah, int ongkir) {
        int total;
        total = ((harga + hUkuran) * jumlah + ongkir);
        super.setTotalHarga(total);
    }

    
    @Override
    public void insert() {

        try {

            String url = "INSERT INTO jersey VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection conn = (Connection) Koneksi.configDB();                                  
            PreparedStatement stm = conn.prepareStatement(url);                                 
            stm.setString(1, getMerk());
            stm.setString(2, getUkuran());
            stm.setString(3, getNamaPunggung());
            stm.setInt(4, getHarga());
            stm.setInt(5, getHargaUkuran());
            stm.setInt(6, getJumlah());
            stm.setString(7, getJasaKirim());
            stm.setInt(8, getOngkir());
            stm.setInt(9, getTotalHarga());
            stm.setString(10, getPembayaran());
            stm.setString(11, getStatusPengiriman());
            stm.setString(12, getIdBarang());

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
                String url = "DELETE From jersey WHERE IDBarang = '" + getIdBarang() + "'";
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
                String url = "UPDATE jersey SET Merk=?, Ukuran=?, NamaPunggung=?, Harga=?, HargaUkuran=?, JumlahBarang=?, "
                        + "JasaKirim=?, Ongkir=?, TotalHarga=?, Pembayaran=?, StatusPengiriman=?, IDBarang=?"
                        + "WHERE IDBarang = '" + getIdBarang() + "'";
                Connection conn = (Connection) Koneksi.configDB();                                        
                PreparedStatement stm = conn.prepareStatement(url);
                stm.setString(1, getMerk());
                stm.setString(2, getUkuran());
                stm.setString(3, getNamaPunggung());
                stm.setInt(4, getHarga());
                stm.setInt(5, getHargaUkuran());
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
            String sql = "SELECT * FROM jersey WHERE IDBarang = '" + getIdBarang() + "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {

                setMerk(rs.getString("Merk"));
                setUkuran(rs.getString("Ukuran"));
                setNamaPunggung(rs.getString("NamaPunggung"));
                setHarga(rs.getInt("Harga"));
                setHargaUkuran(rs.getInt("HargaUkuran"));
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
        String cetak = ("\n" + "Merk Jersey\t\t:  " + getMerk() + "\n"
                + "Ukuran\t\t:  " + getUkuran() + "\n"
                + "Nama Punggung\t:  " + getNamaPunggung() + "\n"
                + "Harga Jersey\t\t:  " + getHarga() + "\n"
                + "Harga Ukuran\t\t:  " + getHargaUkuran() + "\n"
                + "Jumlah Barang\t\t:  " + getJumlah() + "\n"
                + "Jasa Pengiriman\t:  " + getJasaKirim() + "\n"
                + "Ongkir\t\t:  " + getOngkir() + "\n"
                + "Total Harga\t\t:  " + getTotalHarga() + "\n"
                + "Metode Pembayaran\t:  " + getPembayaran() + "\n"
                + "Status Pengiriman\t:  " + getStatusPengiriman()+ "\n"
                + "ID Barang\t\t:  " + getIdBarang() + "\n\n"
                + "#########################################\n"
                + "**TERIMAKASIH TELAH MEMBELI JERSEY DI TOKO KAMI**");
        return cetak;
    }
}
