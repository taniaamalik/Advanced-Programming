package BAB2;

import java.util.Scanner;

class JumlahKata {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukan string : ");
        String kata = s.nextLine();

        int jumlahKata = 0;
        int i = 0;
        while (i < kata.length()) {
            while (i < kata.length() && kata.charAt(i) == ' ') {
                i++;
            }

            if (i < kata.length() && kata.charAt(i) != ' ') {
                jumlahKata++;
                while (i < kata.length() && kata.charAt(i) != ' ') {
                    i++;
                }
            }
        }

        System.out.println("\nJumlah Kata : " + jumlahKata + " buah");
    }
}