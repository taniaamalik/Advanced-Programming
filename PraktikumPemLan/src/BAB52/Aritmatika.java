package BAB52;

public class Aritmatika {

    public void hitungPenjumlahan(int a, int b) {
        hitungPerkalian(a,b);
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }
    
    public double hitungPembagian(String nil, String nil2) {
        double Nil = Double.parseDouble(nil);
        double Nil2 = Double.parseDouble(nil2);
        double hasil = Nil/Nil2;
        return hasil;
    }
}