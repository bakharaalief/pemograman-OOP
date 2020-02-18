package pou;

import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        //declare
        boolean status = true;
        boolean status2 = true;
        String nameInput = "";
        int numberMenu = 0;
        int counter = 0;

        //create object activity
        Activity ac = new Activity();
        Attribut at = new Attribut();

        //scanner
        Scanner input = new Scanner(System.in);

        while(status){

            //input 99 untuk exit
            if(numberMenu == 99){
                System.out.println("+===============+");
                System.out.println("Selamat Tinggal, semoga bermain kembali :)");
                status = false;
            }

            else{

                while (status2){
                    //ketika hewan masih belum puya nama
                    System.out.println("+===============+");
                    System.out.println("Selamat Datang di Tamagochi");
                    System.out.println("Hewan mu belum punya nama");
                    System.out.print("masukkan nama : ");
                    nameInput = input.next();

                    //ketika nama yang diinput sudah lebih dari lima
                    if (nameInput.length() >= 3 ){
                        ac.nama(nameInput);
                        status2 = false;
                    }

                    //notice yang ditampilkan ketika nama kurang dari  5 huruf
                    else{
                        System.out.println("masukkan kembali nama, minimal 3 huruf");
                    }
                }

                //Menu table
                System.out.println("+===============+");
                System.out.println("Selamat Datang, " + nameInput + " :)");
                System.out.println("Pilihan Menu : ");
                System.out.println("[1] Makan | [4] Main       | [7] Status");
                System.out.println("[2] Tidur | [5] Minum Obat | [8] Soon ");
                System.out.println("[3] Mandi | [6] Elus       | [99] Exit");

                //input number menu
                System.out.print("masukkan angka : ");
                numberMenu = input.nextInt();

                //input number 1 (makan)
                if(numberMenu == 1){
                    System.out.print("Mau memberi makan berapa banyak ? ");
                    int amount = input.nextInt();
                    ac.makan(amount);
                }

                //input number 2 (Tidur)
                else if(numberMenu == 2){
                    System.out.print("Mau tidur berapa menit ? ");
                    int amount = input.nextInt();
                    ac.tidur(amount);
                }

                //input number 3 (mandi)
                else if(numberMenu == 3){
                    if(at.getHealty() == 0){
                        System.out.println("Kamu sedang sakit. silahkan pilih nomor 5");
                    }

                    else{
                        System.out.print("Mau mandi berapa menit ? ");
                        int amount = input.nextInt();
                        ac.mandi(amount);
                    }
                }

                //input number 4 (main)
                else if(numberMenu == 4){
                    if(at.getEnergy() == 0){
                        System.out.println("Energy mu habis silahkan makan terlebih dahulu");
                    }

                    else{
                        System.out.print("Mau main berapa menit ? ");
                        int amount = input.nextInt();
                        ac.main(amount);
                    }
                }

                //input number 5 (obat)
                else if (numberMenu == 5){

                    //ketika sudah memberi obat lebih dari 3 kali
                    if(counter > 3){
                        System.out.println("Maaf sudah 3x memberi obat");
                    }

                    else{
                        System.out.print("Mau minum obat berapa banyak (kelipatan 5) ? ");
                        int amount = input.nextInt();

                        //kelipatan 5
                        while (amount % 5 != 0){
                            System.out.println("Maaf bukan kelipatan 5");

                            System.out.print("Mau minum obat berapa banyak (kelipatan 5) ? ");
                            amount = input.nextInt();
                        }

                        //dosis lebih dari 20
                        while (amount > 20){
                            System.out.println("Maaf dosis terlalu banyak. batas 20");

                            System.out.print("Mau minum obat berapa banyak (kelipatan 5) ? ");
                            amount = input.nextInt();
                        }

                        ac.obat(amount);
                        counter++;
                    }
                }

                //input number 6 (elus)
                else if(numberMenu == 6){
                    ac.elus();
                }

                //input number 7 (keadaan)
                else if(numberMenu == 7){
                    ac.keadaan();
                }

            }
        }
    }
}
