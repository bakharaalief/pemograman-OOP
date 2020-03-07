package uangOnline;

public class EDuit {
    private double saldo;
    private String noSeri;

    public EDuit(){

    }

    public EDuit(double saldo, String noSeri) {
        this.saldo = saldo;
        this.noSeri = noSeri;
    }

    //getsaldo
    public double getSaldo() {
        return saldo;
    }

    //setSaldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //getNoSeri
    public String getNoSeri() {
        return noSeri;
    }

    //setNoSeri
    public void setNoSeri(String noSeri) {
        this.noSeri = noSeri;
    }
}
