package BAB72;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate tglLahir;

    public Employee(String name, String noKTP, String tglLahir, int tgl, int bulan, int tahun) {
        this.name = name;
        this.noKTP = noKTP;
        this.tglLahir = LocalDate.of(tahun, bulan, tgl);
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return String.format(getName() + "\nNo. KTP : " + getNoKTP());
    }

    public abstract double earnings();//pendapatan 
}