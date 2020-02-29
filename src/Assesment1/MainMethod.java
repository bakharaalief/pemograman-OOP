package Assesment1;

public class MainMethod {
    public static void main(String[] args) {
        KartuATM ayam1 = new KartuATM("1", "1", "ayam1", 10000);
        KartuATM ayam2 = new KartuATM("1", "1", "ayam2", 10000);

        //setor tunai
        ayam1.setorTunai(50000);
        //ayam2.setorTunai(50000);

        //beli token
        ayam1.beliToken(10000);
        //ayam2.beliToken(10000);

        //keadaan token
        System.out.println(ayam1.getTokenDapat());
        //System.out.println(ayam2.getTokenDapat());

        //tarik tunai
        ayam1.tarikTunai(10000);
        //ayam2.tarikTunai(10000);

        //transfer uang
        ayam1.trasfer(10000, ayam2);
        //ayam2.trasfer(10000, ayam1);

        //keadaan saldo
        System.out.println(ayam1.getSaldo());
        System.out.println(ayam2.getSaldo());
    }
}
