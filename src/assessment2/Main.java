package assessment2;

public class Main {
    public static void main(String[] args) {
        //scenario 1
        Nasabah nasabah1 = new Nasabah("Agus");
        nasabah1.pilihRekeningAktif(0);
        nasabah1.setorTunai(150000);
        nasabah1.ambilUang(15000, 3);
        nasabah1.lihatInfoRekening();

        //scenario 2
        Nasabah nasabah2 = new Nasabah("Bambang");
        nasabah2.pilihRekeningAktif(1);
        nasabah2.setorTunai(150000);
        nasabah2.ambilUang(15000, 3);
        nasabah2.lihatInfoRekening();

        //scenario 3
        Nasabah nasabah3 = new Nasabah("Agus");
        nasabah3.pilihRekeningAktif(1);
        nasabah3.setorTunai(150000);
        nasabah3.ambilUang(15000, 12);
        nasabah3.lihatInfoRekening();
    }
}
