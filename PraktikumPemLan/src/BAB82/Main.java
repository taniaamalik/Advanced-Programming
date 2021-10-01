package BAB82;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Nama : ");
        String n = in.nextLine();
        System.out.print("Masukan Umur : ");
        int u = in.nextInt();
        Hewan h = new Hewan(n, u);
        System.out.println("---------------------------");
        h.tampilkanNama();
        h.tampilkanUmur();
        h.makan();
        h.berjalan();
        h.bersuara();
    }
}