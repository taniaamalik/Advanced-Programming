package BAB3;

import java.io.*;

public class Buku {

    private String Kategori1;
    private String Judul1;
    private String Penulis1;
    private String Kategori2;
    private String Judul2;
    private String Penulis2;
    private String Kategori3;
    private String Judul3;
    private String Penulis3;
    private static double Royalti1;
    private static double Royalti2;

    public void bacaFile(String pathFile) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String[] atribut = br.readLine().split("; ");
            Kategori1 = atribut[0];
            Judul1 = atribut[1];
            Penulis1 = atribut[2];
            atribut = br.readLine().split("; ");
            Kategori2 = atribut[0];
            Judul2 = atribut[1];
            Penulis2 = atribut[2];
            atribut = br.readLine().split("; ");
            Kategori3 = atribut[0];
            Judul3 = atribut[1];
            Penulis3 = atribut[2];
            System.out.println("==========================================================================================");
            System.out.println("Kategori: " + Kategori1);
            System.out.println("Judul   : " + Judul1);
            System.out.println("Penulis : " + Penulis1);
            System.out.println("==========================================================================================");
            System.out.println("Kategori: " + Kategori2);
            System.out.println("Judul   : " + Judul2);
            System.out.println("Penulis : " + Penulis2);
            System.out.println("==========================================================================================");
            System.out.println("Kategori: " + Kategori3);
            System.out.println("Judul   : " + Judul3);
            System.out.println("Penulis : " + Penulis3);
            System.out.println("==========================================================================================");
        }
    }

    public void simpanFile(String namaFile) throws IOException {
        String Buku1 = "Kategori: " + Kategori1 + "\r\n" + "Judul   : " + Judul1 + "\r\n" + "Penulis : " + Penulis1 + "\r\n" + "==========================================================================================" + "\r\n";
        String Buku2 = "Kategori: " + Kategori2 + "\r\n" + "Judul   : " + Judul2 + "\r\n" + "Penulis : " + Penulis2 + "\r\n" + "==========================================================================================" + "\r\n";
        String Buku3 = "Kategori: " + Kategori3 + "\r\n" + "Judul   : " + Judul3 + "\r\n" + "Penulis : " + Penulis3 + "\r\n" + "==========================================================================================" + "\r\n";
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(namaFile), "utf-8"))) {
            writer.write(Buku1);
            writer.write(Buku2);
            writer.write(Buku3);
        }
    }

    public static double hitungRoyalti(double harga) {
        Royalti1 = (double) (harga * 10) / 100;
        return Royalti1;
    }

    public static double hitungRoyalti(double harga, double persen) {
        Royalti2 = (double) (harga * persen) / 100;
        return Royalti2;
    }
}