package pulpenOOP;

public class MainMethod {
    public static void main(String[] args) {
        /*create object*/
        Pulpen pulpen1 = new Pulpen("stabilo");

        /*secara default isi pulpen adalah 0*/
        pulpen1.infoPulpen();

        /*lalu tinta di isi 10*/
        pulpen1.diIsiUlang(10);

        /*tinta dipakai 5*/
        pulpen1.diPakai(5);

        /*kondisi tinta sekarang*/
        pulpen1.infoPulpen();
    }
}
