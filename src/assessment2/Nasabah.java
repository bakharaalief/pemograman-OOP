package assessment2;

public class Nasabah {
    private String nama;
    private Rekening[] rekening = new Rekening[2];
    private Rekening rekeningAktif;

    public Nasabah(String nama){
        this.nama = nama;

        rekening[0] = new Valas("VALAS001", "USD", 15000);
        rekening[1] = new TabunganRencana("TBREN001", 10);
    }

    public void pilihRekeningAktif(int index){
        rekeningAktif = rekening[index];
    }

    public void lihatInfoRekening(){
        System.out.println("Nama pemilik    : " + nama);
        String tipeRekening = rekeningAktif == rekening[0] ? "Valas": "Tabungan Rencana";

        System.out.println("Rekening Pilih  : " + tipeRekening);

        rekeningAktif.info();
    }

    public void ambilUang(double uang, int bulan){
        rekeningAktif.kurangiSaldo(uang, bulan);
    }

    public void setorTunai(double uang){
        rekeningAktif.tambahSaldo(uang);
    }


}
