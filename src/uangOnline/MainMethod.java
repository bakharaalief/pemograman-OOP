package uangOnline;

public class MainMethod {
    public static void main(String[] args) {
        //create objek
        EDuit tapCash = new EDuit();
        Handphone hp = new Handphone();

        //isi saldo lewat hp
        hp.isiSaldo(tapCash, 10000);

        //dashboard
        Dashboard ds = new Dashboard();

        //tap kartu 1
        ds.tap(tapCash);

        //tap kartu 2
        ds.tap(tapCash);

        //tap kartu 3
        ds.tap(tapCash);

        //cek saldo lewat hp
        hp.cekSaldo(tapCash);



    }
}
