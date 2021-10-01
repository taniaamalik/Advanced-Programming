package BAB6;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJenisKelamin(boolean jk) {
        this.jenisKelamin = jk;
    }

    public String getJenisKelamin() {
        if (jenisKelamin == true) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public double getTunjangan() {
        if (menikah == true) {
            if (jenisKelamin == true) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.1f","nama", nama, "nik", nik, "jenisKelamin", getJenisKelamin(), "pendapatan", getPendapatan());             
     }
}