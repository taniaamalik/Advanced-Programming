package BAB5;

import java.util.Scanner;

public class MainPerusahaan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah;
        for (int i = 0; i < 10;) {
            System.out.println("Menu =");
            System.out.println("0. Exit");
            System.out.println("1. Jaket A");
            System.out.println("2. Jaket B");
            System.out.println("3. Jaket C");
            System.out.print("Masukan Pilihan : ");
            int p = in.nextInt();
            switch (p) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Perusahaan jaketA = new Perusahaan(100000, 95000);
                    System.out.print("Masukan Jumlah Jaket A : ");
                    jumlah = in.nextInt();
                    jaketA.beliJaketA(jumlah);
                    break;
                case 2:
                    Perusahaan jaketB = new Perusahaan(125000, 120000);
                    System.out.print("Masukan Jumlah Jaket B : ");
                    jumlah = in.nextInt();
                    jaketB.beliJaketB(jumlah);
                    break;
                case 3:
                    Perusahaan jaketC = new Perusahaan(175000, 160000);
                    System.out.print("Masukan Jumlah Jaket C : ");
                    jumlah = in.nextInt();
                    jaketC.beliJaketC(jumlah);
                    break;
                default:
                    System.out.println("Pilihan Yang Anda Masukan Salah");
            }
        }
    }
}