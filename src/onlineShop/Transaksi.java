package onlineShop;

public class Transaksi {
    private String idTransaksi;
    private int total;

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public int getTotal() {
        return total;
    }

    public void catatTransaksi(String id, int total){
        this.idTransaksi = id;
        this.total = total;
    }
}
