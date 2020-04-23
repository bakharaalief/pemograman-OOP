package assessment2;

public class TabunganRencana extends Rekening implements Administrasi {
    private int periode;

    public TabunganRencana(String noRek, int periode) {
        super(noRek);
        this.periode = periode;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Periode         : " + periode);
        System.out.println(" ");
    }

    public void kurangiSaldo(double uang, int bulan){
        if(bulan < periode){
            int kurang = periode - bulan;

            System.out.println("Maaf belum mampu ditarik, kurang " + kurang + " bulan");

        } else{

            System.out.println("Berhasil ditarik");

            double pengurangan = uang + hitungBiayaAdmin();
            super.kurangiSaldo(pengurangan, bulan);

        }

    }

    @Override
    public double hitungBiayaAdmin() {
        return BIAYA_ADMIN / 2;
    }
}
