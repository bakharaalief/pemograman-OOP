package kendaraan;

public class Motor extends Kendaraan implements Pajak{
    private String warnaJok;

    public Motor(int jumlahRoda, String bahanBakar, int mesin, String warnaJok, double harga){

        //memasukkan data ke method constructor super class
        super(jumlahRoda, bahanBakar, mesin, harga);
        this.warnaJok = warnaJok;

    }

    @Override
    public void deskripsi(){
        System.out.println("Motor");
        super.deskripsi();
        System.out.println("warna jok   : " + warnaJok);
    }

    @Override
    public void hitungPajak() {
        System.out.println("pajak : " + persen * harga );
    }
}
