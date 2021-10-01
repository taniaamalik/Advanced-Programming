package BAB6;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public double getBonus() {
        LocalDate date = LocalDate.now();
        int lamaBekerja = date.getYear() - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja < 5) {
            return 5 * gaji / 100;
        } else if (lamaBekerja >= 5 && lamaBekerja < 10) {
            return 10 * gaji / 100;
        } else if (lamaBekerja >= 10) {
            return 15 * gaji / 100;
        } else {
            return 0;
        }
    }

    public double getGaji() {
        return gaji;
    }

    public String toString() {
        return String.format("%-15s: %s\n%-15s: %s\n%-15s: %s\n%-15s: %.1f\n%-15s: %d %d %d\n%-15s: %d\n%-15s: %.1f","nama", super.getNama(), "nik", super.getNik(), "jenisKelamin", super.getJenisKelamin(), "pendapatan", (getGaji() + getBonus() + (super.getTunjangan() + jumlahAnak * 20)), "tahun masuk",  tahunMasuk.getDayOfMonth(), tahunMasuk.getMonthValue(), tahunMasuk.getYear(), "jumlah anak", jumlahAnak, "gaji", gaji);
     }
}