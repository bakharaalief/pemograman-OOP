package kendaraan;

public class Mobil extends Kendaraan implements Pajak{
    private int jumlahPintu;

    public Mobil(int jumlahRoda, String bahanBakar, int mesin, int jumlahPintu, double harga){
        super(jumlahRoda, bahanBakar, mesin, harga);

        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void deskripsi(){
        System.out.println("Mobil");
        super.deskripsi();
        System.out.println("jumlah pintu: " + jumlahPintu);
    }

    @Override
    public void hitungPajak() {
        System.out.println("pajak : " + persen * harga * jumlahRoda );
    }
}
