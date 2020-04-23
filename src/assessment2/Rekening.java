package assessment2;

public abstract class Rekening {
    protected String noRek;
    protected double saldo;

    public Rekening(String noRek) {
        this.noRek = noRek;
    }

    public String getNoRek() {
        return noRek;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tambahSaldo(double uang){
        this.saldo += uang;
    }

    public void kurangiSaldo(double uang, int bulan){
        this.saldo -= uang;
    }

    public void info(){
        System.out.println("No rekening     : " + noRek);
        System.out.println("Jumlah saldo    : " + saldo);
    };
}
