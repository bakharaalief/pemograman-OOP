package Assesment1;

public class KartuATM {
    private String nomorKartu;
    private String nomorRekening;
    private String namaNasabah;
    private int saldo;
    private int tokenDapat;

    public KartuATM() {
        this.nomorKartu = "012345";
        this.nomorRekening = "012345";
        this.namaNasabah = "kosong";
        this.saldo = 0;
        this.tokenDapat = 0;
    }

    public KartuATM(String nomorKartu, String nomorRekening, String namaNasabah, int saldo) {
        this.nomorKartu = nomorKartu;
        this.nomorRekening = nomorRekening;
        this.namaNasabah = namaNasabah;
        this.saldo = saldo;
    }

    //getSaldo
    public String getSaldo() {
        return namaNasabah + " : Saldo anda sekarang  " + saldo;
    }

    //getToken
    public String getTokenDapat() {
        return namaNasabah + " : Token anda sekarang  " + tokenDapat;
    }

    //setor uang
    public void setorTunai(int uang){
        //kelipatan 20.000
        if(uang % 20000 == 0){
            saldo += uang;
            System.out.println(namaNasabah + " : melakukan setoran tunai sebanyak " + uang);
        }

        //kelipatan 50.000
        else if(uang % 50000 == 0){
            saldo += uang;
            System.out.println(namaNasabah + " : melakukan setoran tunai sebanyak " + uang);
        }

        //kelipatan 100.000
        else if(uang % 100000 == 0){
            saldo += uang;
            System.out.println(namaNasabah + " : melakukan setoran tunai sebanyak " + uang);
        }

        //selain itu
        else{
            System.out.println(namaNasabah + " : masukkan uang kelipatan 20.000, 50.000, 100.000 untuk setoran");
        }
    }

    //tarik uang
    public void tarikTunai(int uang){
        //kelipatan 50.000
        if(uang % 50000 == 0){
            //jika saldo kurang
            if(saldo - uang < 0){
                System.out.println(namaNasabah + " : maaf saldo anda tidak mencukupi untuk tarik tunai");
            }

            //saldo lebih
            else{
                saldo -= uang;
                System.out.println(namaNasabah + " : melakukan tarik tunai sebanyak " + uang);
            }
        }

        //kelipatan 100.000
        else if(uang % 100000 == 0){
            //jika saldo kurang
            if(saldo - uang < 0){
                System.out.println(namaNasabah + " : maaf saldo anda tidak mencukupi untuk tarik tunai");
            }

            //saldo lebih
            else{
                saldo -= uang;
                System.out.println(namaNasabah + " : melakukan tarik tunai sebanyak " + uang);
            }
        }

        //selain itu
        else{
            System.out.println(namaNasabah + " : masukkan uang kelipatan 50.000, 100.000 untuk tarik");
        }
    }

    //beli token listrik
    public void beliToken(int uang){
        if(uang % 1000 == 0){
            //jika saldo kurang
            if(saldo - uang < 0){
                System.out.println(namaNasabah + " : maaf saldo anda tidak mencukupi untuk membeli token");
            }

            //saldo lebih
            else{
                saldo -= uang;
                tokenDapat = uang / 1000;
                System.out.println(namaNasabah + " : melakukan pembelian token sebanyak " + uang + " mendapatkan " + tokenDapat + " KwH");
            }

        }
        else{
            System.out.println(namaNasabah + " : masukkan uang kelipatan 10.000 untuk beli token");
        }
    }

    //transfer uang
    public void trasfer(int uang, KartuATM kartuATM){
        //diatas 10.000
        if(uang >= 10000){
            //jika saldo kurang
            if(saldo - uang < 0){
                System.out.println(namaNasabah + " : maaf saldo anda tidak mencukupi untuk transfer");
            }

            //saldo lebih
            else{
                kartuATM.saldo += uang;
                saldo -= uang;
                System.out.println(namaNasabah + " : Melakukan transfer ke " + kartuATM.namaNasabah + " sebanyak " + uang);
            }
        }

        //selain itu
        else{
            System.out.println(namaNasabah + " : masukkan uang minimal 10.000 untuk transfer");
        }
    }
}
