package uap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataLogin d = new DataLogin();
        Scanner in = new Scanner(System.in);
        boolean x = true;
        for (int i = 0; i < 10;) {
            System.out.println("MENU UTAMA");
            System.out.println("---------------------------- ");
            System.out.println("Menu pilihan: ");
            System.out.println("A. LOGIN");
            System.out.println("B. EXIT");
            System.out.println("----------------------------");
            System.out.print("Pilihan Anda : ");
            String p = in.next();
            if (p.equalsIgnoreCase("A")) {
                in.nextLine();
                System.out.print("Masukkan Nama : ");
                String nama = in.nextLine();
                System.out.print("Masukkan Password : ");
                String pass = in.nextLine();
                d.validasi(nama, pass);
                d.cekData(nama, pass);
                if (d.cekData(nama, pass) == false) {
                    System.out.println("Masukkan salah");
                } else {
                    System.out.println("Selamat datang, " + nama);
                    System.out.println("=====================");
                    for (int j = 0; j < 2; j++) {
                        System.out.println("MENU PILIHAN");
                        System.out.println("---------------------");
                        System.out.println("1. Tes Kendaraan");
                        System.out.println("2. LOG OFF");
                        System.out.println("---------------------");
                        System.out.print("Pilihan Anda : ");
                        int pil = in.nextInt();
                        switch (pil) {
                            case 1:
                                Mobil mobil = new Mobil();
                                Motor motor = new Motor();
                                System.out.print("Cara ngebut pake motor: ");
                                motor.tambahKecepatan();
                                System.out.print("Cara berhentinya: ");
                                motor.kurangiKecepatan();
                                System.out.print("Cara balapan pake mobil: ");
                                mobil.tambahKecepatan();
                                System.out.print("Cara berhentinya: ");
                                mobil.kurangiKecepatan();
                                break;
                            case 2:
                                x = false;
                                break;
                        }
                    }
                }
            }
            if (p.equalsIgnoreCase("B")) {
                System.exit(0);
            }
        }
    }
}