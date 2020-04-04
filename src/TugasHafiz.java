import java.util.Scanner;

public class TugasHafiz {

    public static void main(String[] args) {
        // 1.kita bikin variabelnya lalu masukkan data barang dan harga dengan posisi index yang sama
        // con : Apel = 20.000 maka posisi index apel dan harganya harus sama
        String[] namaBarang = new String[] {"Apel", "Pisang", "Anggur", "Semangka", "Pepaya"};
        int[] hargaBarang = new int[] {20000, 15000, 40000, 10000, 10000};

        //scanner
        Scanner input = new Scanner(System.in);


        System.out.println("1. Apel");
        System.out.println("2. Pisang");
        System.out.println("3. Anggur");
        System.out.println("4. Semangka");
        System.out.println("5. Pepaya");
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        //pembeli memasukkan kode
        System.out.print("Masukkan Code Barang yang ingin dibeli : " );
        int code = input.nextInt();

        //karena index dimulai dari nol, dan kode dimulai dari 1, maka dikurang 1
        int index = code - 1;

        //pembeli memasukkan jumlah pembelian
        System.out.print("Masukkan jumalh Barang yang ingin dibeli : " );
        int jumlah = input.nextInt();

        //pemprosesan harga
        int totalBayar = hargaBarang[index] * jumlah;

        //struk pembelian
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println(
                "Anda membeli " + namaBarang[index] + " seharga " + hargaBarang[index] + " sebanyak " + jumlah + " total " + totalBayar);








    }


}
