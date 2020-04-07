package onlineShop;

public class Majalah extends Produk implements HargaProduk{
    private String namaMajalah;

    public String getNamaMajalah() {
        return namaMajalah;
    }

    public void setNamaMajalah(String namaMajalah) {
        this.namaMajalah = namaMajalah;
    }

    @Override
    public void hitungHarga() {
        int jumlahHal = super.getJumlahHal();
        int harga = jumlahHal * 500;
        super.setHarga(harga);
    }

    @Override
    public void infoProduk() {
        System.out.println("Nama Judul      : " + getNamaMajalah());
        super.infoProduk();
        System.out.println("-------------------");
    }
}
