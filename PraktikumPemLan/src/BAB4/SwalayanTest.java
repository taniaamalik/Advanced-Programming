package BAB4;

import java.util.Scanner;

public class SwalayanTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String noPel, pin;
        int count;
        int x = 0;
        Swalayan[] s = new Swalayan[3];
        s[0] = new Swalayan(3000000, "3812345678", "Amanda Steele", "123456");
        s[1] = new Swalayan(5000000, "5623456789", "Taylor Hill", "234567");
        s[2] = new Swalayan(7000000, "7434567890", "Tania Malik", "345678");
        System.out.println("============== WELCOME TO SWALAYAN TINY ==============");
        for (int i = 0; i < 10;) {
            System.out.println("Menu = ");
            System.out.println("1. Transaksi");
            System.out.println("2. Top Up");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan : ");
            int p = in.nextInt();
            switch (p) {
                case 1:
                    count = 1;
                    in.nextLine();
                    do {
                        System.out.print("Masukkan Nomor Pelanggan Anda : ");
                        noPel = in.nextLine();
                        System.out.print("Masukkan Pin Anda : ");
                        pin = in.nextLine();
                        for (int k = 0; k < s.length; k++) {
                            if (noPel.equals(s[k].getNo_Pelanggan()) && pin.equals(s[k].getPin())) {
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Hi, " + s[k].getNama() + "!");
                                s[k].getKategori();
                                System.out.println("-----------------------------------------------------");
                                System.out.print("Masukkan Total Pembelian : ");
                                s[k].cekSaldo(in.nextDouble());
                                System.out.println("-----------------------------------------------------");
                                x++;
                                count--;
                            }
                        }
                        if (count == 3) {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Akun Anda Terblokir");
                            System.out.println("=====================================================");
                            System.exit(0);
                        }
                        if (x < i || count < 3) {
                            if (x > i) {
                                x--;
                                break;
                            } else {
                                count++;
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Maaf Yang Anda Masukkan Tidak Terdaftar");
                                System.out.println("-----------------------------------------------------");
                            }
                        }
                    } while (x <= i);
                    break;
                case 2:
                    count = 1;
                    in.nextLine();
                    do {
                        System.out.print("Masukkan Nomor Pelanggan Anda : ");
                        noPel = in.nextLine();
                        System.out.print("Masukkan Pin Anda : ");
                        pin = in.nextLine();
                        for (int k = 0; k < s.length; k++) {
                            if (noPel.equals(s[k].getNo_Pelanggan()) && pin.equals(s[k].getPin())) {
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Hi, " + s[k].getNama() + "!");
                                s[k].getKategori();
                                System.out.println("-----------------------------------------------------");
                                System.out.print("Masukkan Nominal Top Up : ");
                                double nom = in.nextDouble();
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Saldo Anda = " + s[k].getTopUp(nom));
                                System.out.println("-----------------------------------------------------");
                                x++;
                                count--;
                            }
                        }
                        if (count == 3) {
                            System.out.println("-----------------------------------------------------");
                            System.out.println("Akun Anda Terblokir");
                            System.out.println("=====================================================");
                            System.exit(0);
                        }
                        if (x < i || count < 3) {
                            if (x > i) {
                                x--;
                                break;
                            } else {
                                count++;
                                System.out.println("-----------------------------------------------------");
                                System.out.println("Maaf Yang Anda Masukkan Tidak Terdaftar");
                                System.out.println("-----------------------------------------------------");
                            }
                        }
                    } while (x <= i);
                    break;
                case 3:
                    System.out.println("===================== THANK YOU =====================");
                    System.exit(0);
            }
        }
    }
}