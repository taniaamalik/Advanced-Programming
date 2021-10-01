package ClassdanObject_Laprak;

public class Lat1 {

    public static void main(String[] args) {
        Kucing kucing = new Kucing();

        kucing.nama = "uci";
//     Kucing kucing2=kucing; //Kucing kucing2 = new Kucing();
//     kucing.nama2 = "rio";
//     System.out.println(kucing.nama2);
        kucing.jenis = "persia";
        kucing.warna = "hitam";
        kucing.jenisKelamin = "Perempuan";
        kucing.umur = 2;

        System.out.println(kucing.nama);
        System.out.println(kucing.jenis);
        System.out.println(kucing.warna);
        System.out.println(kucing.jenisKelamin);
        System.out.println(kucing.umur);

        //Kucing kucing2 = new Kucing();
//        kucing2.nama = "Rio";
//        kucing2.nama = "sos";
//        System.out.println(kucing2.nama); //yang dipanggil yang kedua
//        
        kucing.mengeong();
        kucing.menggaruk();

        //baru   System.out.println(kucing.getNama());
    }
}

class Kucing {

    String nama;
    String jenis;
    String warna;
    String jenisKelamin;
    int umur;
    String nama2;

    //baru
    String getNama() {
        return nama;
    }

    void mengeong() {
        System.out.println("Kucing ini mengeong....");
    }

    void menggaruk() {
        System.out.println("Kucing ini sedang menggaruk...");
    }
}