package onlineShop;

public class User {
    private String namaUser;
    private ShoppingCart sc;

    public User(String namaUser){
        this.namaUser = namaUser;
        sc = new ShoppingCart(getNamaUser());
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void addToCart(Produk p){
        sc.cart(p);
    }

    public void checkOut(Transaksi t){
        sc.bayar(t);

        System.out.println("jumlah pembayaran : " + t.getTotal());
        System.out.println("nama id : " + t.getIdTransaksi() );

        System.out.println("++++++++++++++++");
        System.out.println(" ");
    }

}
