package Dompet;

public class DompetOnline {
    private int saldo;
    private String memberName;

    public DompetOnline() {
    }

    public DompetOnline(int saldo, String memberName) {
        this.saldo = saldo;
        this.memberName = memberName;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
