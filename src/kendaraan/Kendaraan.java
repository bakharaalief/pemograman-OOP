package kendaraan;

public class Kendaraan {
    protected int jumlahRoda ;
    protected String bahanBakar;
    protected int mesin ;
    protected double harga;

    public Kendaraan(int jumlahRoda, String bahanBakar, int mesin, double harga) {
        this.jumlahRoda = jumlahRoda;
        this.bahanBakar = bahanBakar;
        this.mesin = mesin;
        this.harga = harga;
    }

    public void deskripsi(){
        System.out.println("jumlah roda : " + jumlahRoda);
        System.out.println("bahan bakar : " + bahanBakar);
        System.out.println("mesin       : " + mesin);
        System.out.println("harga       : " + harga);
    }
}
