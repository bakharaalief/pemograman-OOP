package kendaraan;

public class Kendaraan {
    protected int jumlahRoda ;
    protected String bahanBakar;
    protected int mesin ;

    public Kendaraan(int jumlahRoda, String bahanBakar, int mesin) {
        this.jumlahRoda = jumlahRoda;
        this.bahanBakar = bahanBakar;
        this.mesin = mesin;
    }

    public void deskripsi(){
        System.out.println("jumlah roda : " + jumlahRoda);
        System.out.println("bahan bakar : " + bahanBakar);
        System.out.println("mesin       : " + mesin);
    }

    public void suaraKnalpot(){
        System.out.println("brem brem");
    }
}
