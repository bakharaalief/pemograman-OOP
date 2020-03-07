package jam;

public class Clock {
    private int jam;
    private int menit;
    private int detik;

    //constructor
    public Clock(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    //convert detik
    public int covertToDetik(){
        int detikAkhir = (jam * 3600) + (menit * 60) + (detik);
        return detikAkhir;
    }
}
