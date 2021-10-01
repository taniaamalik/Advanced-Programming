package quiz3;

public class Desainer extends Karyawan {

    public Desainer(String nama, String tglLahir, String tglMasuk, double gajiPokok) {
        super(nama, tglLahir, tglMasuk, gajiPokok);
    }

    public String getNIK() {
        String tanggalLahir = super.getTgl_lahir().substring(0, 2) + super.getTgl_lahir().substring(3, 5) + super.getTgl_lahir().substring(6, 10);
        String tanggalMasuk = super.getTgl_masuk().substring(0, 2) + super.getTgl_masuk().substring(3, 5) + super.getTgl_masuk().substring(6, 10);
        return tanggalLahir + tanggalMasuk + 3;
    }

    public String toString() {
        return super.toString() + "\nBonus         : " + (super.getGaji_pokok() * 8 / 100) + "\nTotal Gaji    : " + (super.getGaji_pokok() + (super.getGaji_pokok() * 8 / 100));
    }

}