package assessment2;

public class Valas extends Rekening implements Administrasi {
    private String mataUang;
    private double rateKonversi;
    private double hasilBiayaAdmin;

    public Valas(String noRek, String mataUang, double rateKonversi) {
        super(noRek);
        this.mataUang = mataUang;
        this.rateKonversi = rateKonversi;
    }

    @Override
    public void tambahSaldo(double uang){
        double uangKonversi = uang / rateKonversi;
        super.tambahSaldo(uangKonversi);
    }

    public void kurangiSaldo(double uang, int bulan){
        double pengurangan = ( uang + hitungBiayaAdmin() ) / rateKonversi;
        super.kurangiSaldo(pengurangan, bulan);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Mata uang       : " + mataUang);
        System.out.println("Rate konversi   : " + rateKonversi);
        System.out.println(" ");
    }

    @Override
    public double hitungBiayaAdmin() {
        return BIAYA_ADMIN * 2;
    }

}
