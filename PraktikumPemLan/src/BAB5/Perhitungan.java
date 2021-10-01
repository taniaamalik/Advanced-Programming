package BAB5;

public class Perhitungan {

    public static void Penjumlahan(double a, double b) {
        double hasil = a + b;
        System.out.printf("%s%.2f\n", "nilai penjumlahan adalah : ", hasil);
    }

    public static void Pengurangan(double a, double b) {
        double hasil = a - b;
        System.out.printf("%s%.2f\n", "nilai pengurangan adalah : ", hasil);
    }

    public void Perkalian(double a, double b) {
        double hasil = a * b;
        System.out.printf("%s%.2f\n", "nilai perkalian adalah   : ", hasil);
    }

    public void Pembagian(double a, double b) {
        double hasil = a / b;
        System.out.printf("%s%.2f\n", "nilai pembagian adalah   : ", hasil);
    }

    public void Sederhana(double a, double b) {
        int x;
        int pembilang = (int) a;
        int penyebut = (int) b;
        while (penyebut != 0) {
            x = pembilang % penyebut;
            pembilang = penyebut;
            penyebut = x;
        }
        int hasil1 = (int) a / pembilang;
        int hasil2 = (int) b / pembilang;
        System.out.println("pecahan sederhana dari " + "'" + (int) a + "/" + (int) b + "'" + " adalah : " + hasil1 + "/" + hasil2);
    }
}