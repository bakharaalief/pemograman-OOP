package Dompet;

public class User {
    private String nama;
    private String noTelp;
    private DompetOnline dompet;

    public User(String nama, String noTelp, DompetOnline dompet) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.dompet = dompet;
    }

    //isi dompet
    public void isiDompet(int uang){
        dompet.setSaldo(dompet.getSaldo() + uang);
    }

    //beli makanan
    public void beli(Makanan m, int jumlah){
        m.setStock(m.getStock() - jumlah);
        dompet.setSaldo(dompet.getSaldo() - ( m.getHarga() * jumlah ));
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
}
