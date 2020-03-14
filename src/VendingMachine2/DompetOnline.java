package VendingMachine2;

public class DompetOnline {
        private double jumlahSaldo;

        public DompetOnline() {
            this.jumlahSaldo = 0;
        }

        public DompetOnline(double jumlahSaldo) {
            this.jumlahSaldo = jumlahSaldo;
        }

        public void isiSaldo(double jumlahUang){
            this.jumlahSaldo += jumlahUang;
        }

        public void kurangSaldo(double jumlahUang){
            this.jumlahSaldo -= jumlahUang;
        }

        public double getSaldo(){
            return this.jumlahSaldo;
        }

        public void cekSaldo() {
            System.out.println("Saldo anda " + getSaldo());
        }
}
