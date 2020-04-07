package onlineShop;

public abstract class Produk {
    protected String namaProduk;
    protected int jumlahHal;
    protected int harga;

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getJumlahHal() {
        return jumlahHal;
    }

    public void setJumlahHal(int jumlahHal) {
        this.jumlahHal = jumlahHal;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void infoProduk(){
        System.out.println("Jenis Produk    : " + getNamaProduk());
        System.out.println("Jumlah Hal      : " + getJumlahHal());
        System.out.println("Harga Barang    : " + getHarga());
    };
}
