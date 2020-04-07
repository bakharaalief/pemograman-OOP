package onlineShop;

public class Buku extends Produk implements HargaProduk {
    private String judulBuku;

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    @Override
    public void hitungHarga() {
        int jumlahHal = super.getJumlahHal();
        int harga = jumlahHal * 200;
        super.setHarga(harga);
    }

    @Override
    public void infoProduk() {
        System.out.println("Nama Judul      : " + getJudulBuku());
        super.infoProduk();
        System.out.println("-------------------");
    }
}
