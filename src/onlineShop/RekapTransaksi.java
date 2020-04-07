package onlineShop;

import java.util.ArrayList;

public class RekapTransaksi {
    private ArrayList<Transaksi> t = new ArrayList<Transaksi>();
    private int jumlahTransaksi;

    //constructor
    public RekapTransaksi(){

    }

    public void tambahTransaksi(Transaksi tr){
        t.add(tr);
    }

    public void tampilTransaksi(){
        jumlahTransaksi = t.size();
        int totalSeluruhPendapatan  = 0;


        System.out.println("REKAP PEMBAYARAN");
        System.out.println(" ");
        System.out.println("transaksi \t| id \t| total  |");
        System.out.println("------------------------------");

        //looping
        for(int i = 0; i < jumlahTransaksi; i++){

            int urutan = i + 1;
            String idTransaksi = t.get(i).getIdTransaksi();
            int totalTransaksi = t.get(i).getTotal();
            totalSeluruhPendapatan += totalTransaksi;

            System.out.println(urutan + " \t\t\t  " + idTransaksi + " \t  " + totalTransaksi);
        }

        System.out.println("------------------------------");

        System.out.println("Total seluruh pendapatan : " + totalSeluruhPendapatan);

    }
}
