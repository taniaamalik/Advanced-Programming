package BAB6;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public String getStatus() {
        String no = nim.substring(6, 7);
        String no2 = nim.substring(0, 2);
        if (no.equals("2")) {
            return "Teknik Informatika, 20" + no2;
        } else if (no.equals("3")) {
            return "Teknik Komputer, 20" + no2;
        } else if (no.equals("4")) {
            return "Sistem Informasi, 20" + no2;
        } else if (no.equals("6")) {
            return "Pendidikan Teknologi Informasi, 20" + no2;
        } else if (no.equals("7")) {
            return "Teknologi Informasi, 20" + no2;
        } else {
            return "";
        }
    }

    public double getBeasiswa() {
        if (ipk >= 3 && ipk < 3.5) {
            return super.getPendapatan() + 50;
        } else if (ipk >= 3.5 && ipk <= 4) {
            return super.getPendapatan() + 75;
        } else {
            return super.getPendapatan();
        }
    }
    
    public String toString() {
         return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.1f\n%-15s: %s\n%-15s: %.1f\n%-15s: %s","nama", super.getNama(), "nik", super.getNik(), "jenisKelamin", super.getJenisKelamin(), "pendapatan", getBeasiswa(), "nim", getNim(), "ipk", getIpk(), "status", getStatus());
     }
}