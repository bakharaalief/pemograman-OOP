package pou;

public class MainActivity {
    public static void main(String[] args) {
        //create object activity
        Activity ac = new Activity();

        //hari 1
        System.out.println("hari1");
        System.out.println("+------------------+");
        ac.nama("kopet");
        ac.makan(10);
        ac.tidur();
        ac.mandi();

        //keadaan 1
        ac.keadaan();

        //hari2
        System.out.println("hari2");
        System.out.println("+------------------+");
        ac.makan(20);

        //keadaan 2
        ac.keadaan();
    }
}
