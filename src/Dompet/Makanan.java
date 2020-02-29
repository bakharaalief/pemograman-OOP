package Dompet;

public class Makanan {
    private String namaMakanan;
    private int harga;
    private int stock;

    public Makanan() {
        namaMakanan = "soto";
        harga = 20000 ;
    }

    public Makanan(String namaMakanan, int harga, int stock) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.stock = stock;
    }

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
