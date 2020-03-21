package pulpenOOP;

public class Tinta {
    private int jumlah;

    public Tinta() {
        this.jumlah = 0;
    }

    /*method kurang*/
    public void kurang (int jumlah){
        this.jumlah -= jumlah;
    }

    public void tambah(int jumlah){
        this.jumlah += jumlah;
    }

    public void infoTinta(String namaPulpenInput){
        System.out.println(namaPulpenInput + " : tinta anda " + this.jumlah);
    }
}
