package Constructor_Laprak;

public class Lat1 {

    public static void main(String[] args) {
        Lat1 lat1 = new Lat1("Rio", "Persia", "hitam", "Laki-laki");
    }
    private String nama;
    private String jenis;
    private String warna;
    private String jeniskelamin;

    Lat1() { //constructor default
        
    }

    Lat1(String nama, String jenis, String warna, String jeniskelamin) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.jeniskelamin = jeniskelamin;
    }
}