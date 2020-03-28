package kendaraan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(int jumlahRoda, String bahanBakar, int mesin, int jumlahPintu){
        super(jumlahRoda, bahanBakar, mesin);

        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void deskripsi(){
        System.out.println("Mobil");
        System.out.println("jumlah roda : " + super.jumlahRoda);
        System.out.println("bahan bakar : " + super.bahanBakar);
        System.out.println("mesin       : " + super.mesin);
        System.out.println("jumlah pintu: " + jumlahPintu);
    }

}
