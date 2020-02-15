package pertemuan2;

public class MainSegiEmpat {
    public static void main(String[] args) {

        //objek
        SegiEmpat s = new SegiEmpat();

        //input lebar
        s.setLebar(10);

        //input panjang
        s.setPanjang(10);

        //if public
        s.panjang = 20;
        s.lebar = 20;

        //luas
        System.out.println(s.luas());

    }
}
