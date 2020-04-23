public class HafizAss {

    public static void main(String[] args) {
        String[] nim = new String[]{"N1910120042", "N1910120043", "N1910120044", "N1910120045", "N1910120046"};
        String[] nama = new String[]{"Ani Arini", "Budi Mulyadi", "Cecep Gorbacep", "Dedi Dora", "Endah Pamandangan"};
        int[] nilai = new  int[]{80, 73, 95, 45, 60};
        String[] nilaiHuruf = new String[5];
        int nilaiPalingBesar = 0;

        for(int i = 0; i < nilai.length; i++){
            int nilaiOrang = nilai[i];
            String huruf = "kosong";

            if(nilaiOrang > nilaiPalingBesar){
                nilaiPalingBesar = nilaiOrang;
            }


            if(nilaiOrang >= 40){
                huruf = "D";

                if(nilaiOrang >= 60){
                    huruf = "C";

                    if(nilaiOrang >= 70){
                        huruf = "B";

                        if(nilaiOrang > 80){
                            huruf = "A";
                        }

                    }

                }
            }

            else{
                huruf = "E";
            }

            nilaiHuruf[i] = huruf;

        }

        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("----------------------");
        for(int i = 0; i < nilai.length; i++){
            String nimString = nim[i];
            String namaString = nama[i];
            int intNilai = nilai[i];
            String namaNilaiHeruf = nilaiHuruf[i];

            System.out.println(nimString +  " " + namaString + " " + " " + namaNilaiHeruf + " " + intNilai);
        }

        System.out.println("nilai paling besar : " + nilaiPalingBesar);
    }
}
