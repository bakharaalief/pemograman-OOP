package onlineShop;

public class Main {
    public static void main(String[] args) {
        //buat majalah Bobo
        Majalah Bobo = new Majalah();
        Bobo.setNamaProduk("Majalah");
        Bobo.setNamaMajalah("Bobo");
        Bobo.setJumlahHal(120);
        Bobo.hitungHarga();

        //buat majalah why
        Majalah why = new Majalah();
        why.setNamaProduk("Majalah");
        why.setNamaMajalah("why");
        why.setJumlahHal(130);
        why.hitungHarga();

        //buat buku Tere liye ( tentang kamu )
        Buku tentangKamu = new Buku();
        tentangKamu.setNamaProduk("Buku");
        tentangKamu.setJudulBuku("Tentang Kamu");
        tentangKamu.setJumlahHal(200);
        tentangKamu.hitungHarga();

        //buat buku Tere liye ( Bumi )
        Buku bumi = new Buku();
        bumi.setNamaProduk("Buku");
        bumi.setJudulBuku("Tentang Kamu");
        bumi.setJumlahHal(300);
        bumi.hitungHarga();


        //buat

        //melakuakn transaksi1
        Transaksi transaksi1 = new Transaksi();

        //user1 melakukan aktifitas
        User user1 = new User("jono");
        user1.addToCart(Bobo);
        user1.addToCart(why);
        user1.addToCart(tentangKamu);
        user1.checkOut(transaksi1);

        //melakuakn transaksi2
        Transaksi transaksi2 = new Transaksi();

        //user2 melakukan aktifitas
        User user2 = new User("Agus");
        user2.addToCart(bumi);
        user2.checkOut(transaksi2);

        //rekap transaksi
        RekapTransaksi rkp = new RekapTransaksi();
        rkp.tambahTransaksi(transaksi1);
        rkp.tambahTransaksi(transaksi2);
        rkp.tampilTransaksi();





    }
}
