package BAB4;

public class Swalayan {
    private double saldo;
    private String no_Pelanggan;
    private String nama;
    private String pin;
    double discount, total;

    public Swalayan(double saldo, String no_Pelanggan, String nama, String pin) {
        this.saldo = saldo;
        this.no_Pelanggan = no_Pelanggan;
        this.nama = nama;
        this.pin = pin;
    }

    public void setNo_Pelanggan(String noPel) {
        this.no_Pelanggan = noPel;
    }

    public String getNo_Pelanggan() {
        return no_Pelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public double getTopUp(double topUp) {
        return saldo + topUp;
    }

    public void cekSaldo(double totall) {
        this.saldo = saldo - Harga(totall);
        if (saldo >= 10000) {
            System.out.println("Transaksi Berhasil");
            System.out.println("Total Belanja Anda : " + total);
            System.out.println("Sisa Saldo Anda : " + saldo);
        } else {
            System.out.println("Maaf Transaksi Gagal, Saldo Anda Tidak Mencukupi");
            System.out.println("Sisa Saldo Anda : " + saldo);
        }
    }

    public double Harga(double harga) {
        String no = no_Pelanggan.substring(0, 2);
        if (harga > 1000000) {
            if (no.equals("38")) {
                System.out.println("Anda Termasuk Kategori Pelanggan Jenis Silver");
                discount = (harga * 5) / 100;
                total = harga - discount;
            } else if (no.equals("56")) {
                System.out.println("Anda Termasuk Kategori Pelanggan Jenis Gold");
                discount = (harga * 7) / 100;
                total = harga - discount;
                saldo += (total * 2) / 100;
            } else if (no.equals("74")) {
                System.out.println("Anda Termasuk Kategori Pelanggan Jenis Platinum");
                discount = (harga * 10) / 100;
                total = harga - discount;
                saldo += (total * 5) / 100;
            }
        } else {
            total = harga;
        }
        return total;
    }
}