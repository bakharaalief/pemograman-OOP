package jam;

public class PulseCounter {
    private int satuanPulsa;
    private int detikPengurangan;
    private int pulsaTotal;

    //constructor
    public PulseCounter() {
        satuanPulsa = 100;
        detikPengurangan = 0;
        pulsaTotal = 0;
    }

    public int hitungPulsa(Clock c1, Clock c2){
        int detikAwal = c1.covertToDetik();
        int detikAkhir = c2.covertToDetik();

        //mencari total detik telpon
        detikPengurangan = detikAkhir - detikAwal;

        //mencari total pulsa yang digunakan
        pulsaTotal = detikPengurangan * satuanPulsa;

        return pulsaTotal;
    }
}
