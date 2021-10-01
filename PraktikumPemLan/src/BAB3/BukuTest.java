package BAB3;

import java.io.IOException;
import java.util.Scanner;

public class BukuTest {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        double harga, persen;
        Buku buku = new Buku();
        buku.bacaFile("D:\\pathFile.txt");
        buku.simpanFile("D:\\namaFile.txt");
        System.out.print("Masukkan Harga Buku Teknologi : ");
        harga = in.nextDouble();
        System.out.print("Masukkan Persen Buku Teknologi : ");
        persen = in.nextDouble();
        Buku tek = new Buku();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-20s%.2f\n", "Pengembalian Nilai 10%    : Rp.", tek.hitungRoyalti(harga));
        System.out.printf("%-20s%.2f\n", "Pengembalian Nilai persen : Rp.", tek.hitungRoyalti(harga, persen));
        System.out.println("==========================================================================================");
        System.out.print("Masukkan Harga Buku Sejarah : ");
        harga = in.nextDouble();
        System.out.print("Masukkan Persen Buku Sejarah : ");
        persen = in.nextDouble();
        Buku sej = new Buku();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-20s%.2f\n", "Pengembalian Nilai 10%    : Rp.", sej.hitungRoyalti(harga));
        System.out.printf("%-20s%.2f\n", "Pengembalian Nilai persen : Rp.", sej.hitungRoyalti(harga, persen));
        System.out.println("==========================================================================================");
        System.out.print("Masukkan Harga Buku Fiksi : ");
        harga = in.nextDouble();
        System.out.print("Masukkan Persen Buku Fiksi : ");
        persen = in.nextDouble();
        Buku fik = new Buku();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-20s%.2f\n", "Pengembalian Nilai 10%    : Rp.", fik.hitungRoyalti(harga));
        System.out.printf("%-20s%.2f\n", "Pengembalian Nilai persen : Rp.", fik.hitungRoyalti(harga, persen));
        System.out.println("==========================================================================================");
    }
}