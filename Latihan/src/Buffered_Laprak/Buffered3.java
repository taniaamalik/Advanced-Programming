package Buffered_Laprak;

import java.io.*;

public class Buffered3 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\pathFile.txt"))) {
            String[] barisLine = br.readLine().split("; ");
            while (barisLine != null) {
                String kategori = barisLine[0];
                String judul = barisLine[1];
                String penulis = barisLine[2];
                System.out.println("Kategori Buku : " + kategori);
                System.out.println("Judul Buku    : " + judul);
                System.out.println("Penulis Buku  : " + penulis);
            }
            br.close();
        }
    }
}