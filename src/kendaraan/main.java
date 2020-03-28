package kendaraan;

public class main {
    public static void main(String[] args) {

        Motor mtr = new Motor(2, "bensin", 1200, "kuning");

        mtr.deskripsi();

        System.out.println("+++++++++++++++++");

        Mobil mbl = new Mobil(2,"bensin", 1400, 2);

        mbl.deskripsi();

    }
}
