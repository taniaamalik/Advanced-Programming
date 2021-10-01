package ClassdanObject_Laprak;

public class Lat2 {

    public static void main(String[] args) {
        Burung burung = new Burung(); //kalalu satu obj
        burung.warna = "putih";
        burung.jenis = "kakaktua";
        burung.panjang_paruh = 4;
        burung.panjang_sayap = 8;
        burung.berat = 2;

        System.out.println(burung.warna);
        System.out.println(burung.jenis);
        System.out.println(burung.panjang_paruh);
        System.out.println(burung.panjang_sayap);
        System.out.println(burung.berat);

        burung.terbang();
        burung.makan();
        burung.minum();
        burung.tidur();
    }
}

class Burung {

    String warna;
    String jenis;
    int panjang_paruh;
    int panjang_sayap;
    int berat;

    void terbang() {
        System.out.println("Burung ini terbang...");
    }

    void makan() {
        System.out.println("Burung ini makan...");
    }

    void minum() {
        System.out.println("Burung ini minum...");
    }

    void tidur() {
        System.out.println("Burung ini tidur...");
    }
}