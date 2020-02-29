package Dompet;

public class MainDompet {
    public static void main(String[] args) {

        //objek
        DompetOnline gopay = new DompetOnline();

        //set user
        User ul = new User("Bakhara", "0812888887766", gopay);

        //melakukan isi dompet
        ul.isiDompet(10000);

        // set makanan
        Makanan m1 = new Makanan("bebek",10000, 10);
        ul.beli(m1,9);



    }
}
