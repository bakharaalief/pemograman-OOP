package uangOnline;

public class Dashboard {
    private double pendapatan;
    private int jumlahTap;
    private int harga;

    public Dashboard(){
        this.jumlahTap = 0;
        this.pendapatan = 0;
        this.harga = 3500;
    }

    //ngetap emoney
    public void tap(EDuit ed){
        //saldo lebih banyak dari harga
        if(ed.getSaldo() > harga){
            System.out.println("anda melakukan tapping");
            pendapatan += harga;
            jumlahTap++;
            ed.setSaldo(ed.getSaldo() - harga);
        }

        //saldo kurang
        else{
            System.out.println("saldo anda kurang untuk melakukan tapping");
        }

    }


}
