package BAB7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double harga = 0, hargaKP = 0, hargaKJ = 0, berat = 0, jumlah = 0, tertinggi = 0;
        KuePesanan[] kp = new KuePesanan[10];
        kp[0] = new KuePesanan("Nastar", 75000, 1.5);
        kp[1] = new KuePesanan("Kastengel", 80000, 2);
        kp[2] = new KuePesanan("Putri Salju", 70000, 1);
        kp[3] = new KuePesanan("Lidah Kucing", 65000, 0.5);
        kp[4] = new KuePesanan("Red Velvet", 150000, 3);
        kp[5] = new KuePesanan("Choco Cookies", 65000, 1.5);
        kp[6] = new KuePesanan("Cheese Cake", 200000, 3);
        kp[7] = new KuePesanan("Tiramisu", 130000, 2);
        kp[8] = new KuePesanan("Brownies", 100000, 2);
        kp[9] = new KuePesanan("Blackforest", 125000, 2);
        KueJadi[] kj = new KueJadi[10];
        kj[0] = new KueJadi("Kue Sagu", 55000, 1);
        kj[1] = new KueJadi("Lapis Legit", 75000, 3);
        kj[2] = new KueJadi("Kue Pandan", 70000, 1);
        kj[3] = new KueJadi("Lemon Cookies", 52000, 2);
        kj[4] = new KueJadi("Mete Cookies", 80000, 1);
        kj[5] = new KueJadi("Bakpia", 35000, 2);
        kj[6] = new KueJadi("Banana Cake", 56000, 2);
        kj[7] = new KueJadi("Chiffon", 65000, 3);
        kj[8] = new KueJadi("Rainbow Cake", 180000, 3);
        kj[9] = new KueJadi("Coklat Almond", 85000, 2);
        for (int j = 0; j < 10; j++) {
            harga += kp[j].hitungHarga() + kj[j].hitungHarga();
            hargaKP += kp[j].hitungHarga();
            berat += kp[j].getBerat();
            hargaKJ += kj[j].hitungHarga();
            jumlah += kj[j].getJumlah();
            if (kp[j].hitungHarga() > tertinggi) {
                tertinggi = kp[j].hitungHarga();
            }
            if (kj[j].hitungHarga() > tertinggi) {
                tertinggi = kj[j].hitungHarga();
            }
        }
        for (int i = 0; i < 10;) {
            System.out.println("1. Informasi semua kue dan jenis kuenya");
            System.out.println("2. Total harga yang didapat dari semua jenis kue");
            System.out.println("3. Total harga dan total berat dari KuePesanan ");
            System.out.println("4. Total harga dan total jumlah dari KueJadi ");
            System.out.println("5. Informasi kue dengan harga (harga akhir) terbesar");
            System.out.println("6. Keluar");
            System.out.print("Pilihan = ");
            int p = in.nextInt();
            switch (p) {
                case 1:
                    System.out.println("---------------------------------------------------------------");
                    for (int j = 0; j < 10; j++) {
                        System.out.println("Jenis Kue   : Kue Pesanan");
                        System.out.println(kp[j]);
                        System.out.println("Berat       : " + kp[j].getBerat() + " kg");
                        System.out.println("Total Harga : Rp." + kp[j].hitungHarga());
                        System.out.println("---------------------------------------------------------------");
                    }
                    for (int j = 0; j < 10; j++) {
                        System.out.println("Jenis Kue   : Kue Jadi");
                        System.out.println(kj[j]);
                        System.out.println("Jumlah      : " + kj[j].getJumlah());
                        System.out.println("Total Harga : Rp." + kj[j].hitungHarga());
                        System.out.println("---------------------------------------------------------------");
                    }
                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Total Harga(Semua Jenis Kue): " + harga);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Total Harga(Kue Pesanan): " + hargaKP);
                    System.out.println("Total Berat(Kue Pesanan): " + berat);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Total Harga(Kue Jadi): " + hargaKJ);
                    System.out.println("Total Jumlah(Kue Jadi): " + jumlah);
                    System.out.println("---------------------------------------------------------------");
                    break;
                case 5:
                    for (int j = 0; j < 10; j++) {
                        if (tertinggi == kp[j].hitungHarga()) {
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Jenis Kue   : Kue Pesanan");
                            System.out.println(kp[j]);
                            System.out.println("Berat       : " + kp[j].getBerat() + " kg");
                            System.out.println("Total Harga : Rp." + kp[j].hitungHarga());
                            System.out.println("---------------------------------------------------------------");
                        }
                        if (tertinggi == kj[j].hitungHarga()) {
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Jenis Kue   : Kue Jadi");
                            System.out.println(kj[j]);
                            System.out.println("Jumlah      : " + kj[j].getJumlah());
                            System.out.println("Total Harga : Rp." + kj[j].hitungHarga());
                            System.out.println("---------------------------------------------------------------");
                        }
                    }
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("Pilihan tidak ada");
                    System.out.println("---------------------------------------------------------------");
            }
        }
    }
}