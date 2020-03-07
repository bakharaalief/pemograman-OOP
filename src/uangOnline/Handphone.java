package uangOnline;

public class Handphone {
    //cek saldo
    public void cekSaldo(EDuit ed){
        System.out.println("Saldo anda : " + ed.getSaldo());
    }

    //isi saldo
    public void isiSaldo(EDuit ed, double uang){
        ed.setSaldo(ed.getSaldo() + uang);

        System.out.println("Saldo anda sekarang : " + ed.getSaldo());
    }
}
