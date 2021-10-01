package BAB4;

import java.util.Scanner;

public class SwalayanTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String noPel, pin;
        int count = 0;
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
                    in.nextLine();
                    do {
                        for (int k = 0; k < s.length; k++) {
                            System.out.print("Masukkan Nomor Pelanggan Anda : ");
                            noPel = in.nextLine();
                            System.out.print("Masukkan Pin Anda : ");
                            pin = in.nextLine();
                            if (noPel.equals(s[k].getNo_Pelanggan()) && pin.equals(s[k].getPin())) {
                                System.out.println("Hi, " + s[k].getNama() + "!");
                                System.out.print("Masukkan Total Pembelian : ");
                                s[k].cekSaldo(in.nextDouble());
                                x++;
                                break;
                            }
                            if (count == 0 || count % 3 == 1 || count % 3 == 2) {
                                if (pin.equals(s[k].getPin())) {
                                    count++;
                                    System.out.println("Nomor Pelanggan Anda Salah");
                                } else if (noPel.equals(s[k].getNo_Pelanggan())) {
                                    count++;
                                    System.out.println("Pin Anda Salah");
                                } else {
                                    count++;
                                    System.out.println("Nomor Pelangan dan Pin Anda Salah");
                                }
                            }
                            if (count != 0 && count % 3 == 0) {
                                System.out.println("Akun Anda Terblokir");
                                System.exit(0);
                            }
                        }
                    } while (x <= i);
                    break;
                case 2:
                    in.nextLine();
                    do {
                        for (int k = 0; k < s.length; k++) {
                            System.out.print("Masukkan Nomor Pelanggan Anda : ");
                            noPel = in.nextLine();
                            System.out.print("Masukkan Pin Anda : ");
                            pin = in.nextLine();
                            if (noPel.equals(s[k].getNo_Pelanggan()) && pin.equals(s[k].getPin())) {
                                System.out.println("Hi, " + s[k].getNama() + "!");
                                System.out.print("Masukkan Nominal Top Up : ");
                                System.out.println("Saldo Anda = " + s[k].getTopUp(in.nextDouble()));
                                x++;
                                break;
                            }
                            if (count == 0 || count % 3 == 1 || count % 3 == 2) {
                                if (pin.equals(s[k].getPin())) {
                                    count++;
                                    System.out.println("Nomor Pelanggan Anda Salah");
                                } else if (noPel.equals(s[k].getNo_Pelanggan())) {
                                    count++;
                                    System.out.println("Pin Anda Salah");
                                } else {
                                    count++;
                                    System.out.println("Nomor Pelangan dan Pin Anda Salah");
                                }
                            }
                            if (count != 0 && count % 3 == 0) {
                                System.out.println("Akun Anda Terblokir");
                                System.exit(0);
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