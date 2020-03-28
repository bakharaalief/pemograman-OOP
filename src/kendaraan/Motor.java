package kendaraan;

public class Motor extends Kendaraan {
    private String warnaJok;

    public Motor(int jumlahRoda, String bahanBakar, int mesin, String warnaJok){

        //memasukkan data ke method constructor super class
        super(jumlahRoda, bahanBakar, mesin);
        this.warnaJok = warnaJok;

    }

    @Override
    public void deskripsi(){
        System.out.println("Motor");
        System.out.println("jumlah roda : " + super.jumlahRoda);
        System.out.println("bahan bakar : " + super.bahanBakar);
        System.out.println("mesin       : " + super.mesin);
        System.out.println("warna jok   : " + warnaJok);
    }

}
