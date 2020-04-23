public class Iseng {
    public static void main(String[] args){
        String ayamPisah[];
        String kata = "10+2";
        int total = 0;

        ayamPisah = kata.split("[+]");

        System.out.println(ayamPisah.length);

        for(int i = 0; i < ayamPisah.length; i++){
            int nilai = Integer.parseInt(ayamPisah[i]);
            total += nilai;
        }
        System.out.println(total);
    }
}
