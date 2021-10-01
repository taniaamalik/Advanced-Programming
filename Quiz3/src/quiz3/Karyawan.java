package quiz3;

public class Karyawan {
    private String Nama;
    private String NIK;
    private String tgl_lahir;
    private String tgl_masuk;
    private double gaji_pokok;

    public Karyawan(String nama, String tglLahir, String tglMasuk, double gajiPokok) {
        this.Nama = nama;
        this.tgl_lahir = tglLahir;
        this.tgl_masuk = tglMasuk;
        this.gaji_pokok = gajiPokok;
    }
    
    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public double getGaji_pokok() {
        return gaji_pokok;
    }
    
    public String getNIK() {
        String tanggalLahir = getTgl_lahir().substring(0, 2) + getTgl_lahir().substring(3, 5) + getTgl_lahir().substring(6, 10);
        String tanggalMasuk = getTgl_masuk().substring(0, 2) + getTgl_masuk().substring(3, 5) + getTgl_masuk().substring(6, 10);
        return tanggalLahir + tanggalMasuk;
    }

    public String toString() {
        return "Nama          : " + this.Nama + "\nNIK           : " + getNIK() + "\nTanggal Lahir : " + this.tgl_lahir + "\nTanggal Masuk : " + this.tgl_masuk + "\nGaji Pokok    : " + this.gaji_pokok;
    }

}