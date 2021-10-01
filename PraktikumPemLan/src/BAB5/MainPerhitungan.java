package BAB5;

import java.util.Scanner;

public class MainPerhitungan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai 1 : ");
        double a = in.nextDouble();
        System.out.print("masukkan nilai 2 : ");
        double b = in.nextDouble();
        System.out.println("-----------------------------------------");
        Perhitungan.Penjumlahan(a, b);
        Perhitungan.Pengurangan(a, b);
        Perhitungan hitung = new Perhitungan();
        hitung.Perkalian(a, b);
        hitung.Pembagian(a, b);
        hitung.Sederhana(a, b);
    }
}