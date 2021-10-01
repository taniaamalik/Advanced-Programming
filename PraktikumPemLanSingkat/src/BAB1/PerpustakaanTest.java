package BAB1;

import java.util.Scanner;

public class PerpustakaanTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        perpus.KategoriBuku();
        System.out.print("Masukan Kategori Buku : ");
        perpus.setJenisBuku(in.nextInt());
        perpus.getJenisBuku();
    }
}