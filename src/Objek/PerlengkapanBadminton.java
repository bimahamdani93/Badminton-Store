package Objek;

public abstract class PerlengkapanBadminton {

    private String merk;
    private int harga;
    private int jumlah;
    private String pembayaran;
    private String jasaKirim;
    private int ongkir;
    private int totalHarga;
    private String idBarang;
    private String statusPengiriman ;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getJasaKirim() {
        return jasaKirim;
    }

    public void setJasaKirim(String jasaKirim) {
        this.jasaKirim = jasaKirim;
    }

    public int getOngkir() {
        return ongkir;
    }

    public void setOngkir(int ongkir) {
        this.ongkir = ongkir;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getStatusPengiriman() {
        return statusPengiriman;
    }

    public void setStatusPengiriman(String statusPengiriman) {
        this.statusPengiriman = statusPengiriman;
    }


    public abstract void insert();

    public abstract void delete();

    public abstract void update();

    public abstract void search();

    public abstract String print();

}
