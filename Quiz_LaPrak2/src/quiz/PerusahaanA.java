package quiz;

public class PerusahaanA {
    private String nama;
    private String id;
    private String usia;
    private String jabatan_Karyawan;
    private String pass;
    private double gaji;
    private double bonus,TotalGaji, Pengurangan;

    public PerusahaanA(String nama, String id, String usia, String jk, String pass, double gaji) {
        this.nama = nama;
        this.id = id;
        this.usia = usia;
        this.jabatan_Karyawan = jk;
        this.pass = pass;
        this.gaji = gaji;
    }

    public String getID() {
        return id;
    }

    public String getPass() {
        return pass;
    }
    
    public double PenguranganGaji(int hari) {
        String noID = getID().substring(0, 2);
                Pengurangan = (100000*hari);
            if (noID.equals("30")) {
                TotalGaji = 12000000-Pengurangan;
            } else if (noID.equals("20")) {
                TotalGaji = 8000000-Pengurangan;
            } else if (noID.equals("18")) {
                TotalGaji = 6000000-Pengurangan;
            } else if (noID.equals("15")) {
                TotalGaji = 5000000-Pengurangan;
            } else {
                TotalGaji = 0;
            }
        return TotalGaji;
    }

    public double Bonus(int lembur) {
        String no = getID().substring(0, 2);
        if (lembur > 10) {
            if (no.equals("30")) {
                bonus = (40 * 12000000) / 100;
            } else if (no.equals("20")) {
                bonus = (30 * 8000000) / 100;
            } else if (no.equals("18")) {
                bonus = (25 * 6000000) / 100;
            } else if (no.equals("15")) {
                bonus = (25 * 5000000) / 100;
            } else {
                bonus = 0;
            }
        }
        return bonus;
    }

    public void displayMessage() {
        System.out.println("Anda Telah Log-in");
        System.out.println("---------------DATA KARYAWAN--------------");
        System.out.println("Nama               : " + nama);
        System.out.println("Usia               : " + usia);
        System.out.println("Jabatan            : " + jabatan_Karyawan);
        System.out.println("Gaji Awal          : " + gaji);
        System.out.println("Bonus              : " + bonus);
        System.out.println("Jumlah Gaji Bersih : " + (gaji + bonus));
    }
    
    public void displayMessage2() {
        System.out.println("---------------DATA KARYAWAN--------------");
        System.out.println("Nama               : " + nama);
        System.out.println("Usia               : " + usia);
        System.out.println("Jabatan            : " + jabatan_Karyawan);
        System.out.println("Gaji Awal          : " + gaji);
        System.out.println("Pengurangan Gaji   : " + Pengurangan);
        System.out.println("Jumlah Gaji        : " + TotalGaji);
    }
}