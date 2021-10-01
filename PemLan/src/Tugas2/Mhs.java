package Tugas2;

public class Mhs {

    private String Nama;
    private String NIM;
    private double nilaiTugas;
    private double nilaiQuiz;
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiAkhir;
    private double nilaiRata2;

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setNIM(String nim) {
        NIM = nim;
    }

    public void setnilaiTugas(double nilaitugas) {
        nilaiTugas = nilaitugas;
    }

    public void setnilaiQuiz(double nilaiquiz) {
        nilaiQuiz = nilaiquiz;
    }

    public void setnilaiUTS(double nilaiuts) {
        nilaiUTS = nilaiuts;
    }

    public void setnilaiUAS(double nilaiuas) {
        nilaiUAS = nilaiuas;
    }

    public String getNama() {
        return Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public double getnilaiTugas() {
        return nilaiTugas;
    }

    public double getnilaiQuiz() {
        return nilaiQuiz;
    }

    public double getnilaiUTS() {
        return nilaiUTS;
    }

    public double getnilaiUAS() {
        return nilaiUAS;
    }

    public double getnilaiAkhir() {
        nilaiAkhir = (0.15 * nilaiTugas) + (0.15 * nilaiQuiz) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
        return nilaiAkhir;
    }

    public double getnilaiRata2(double mhs1, double mhs2, double mhs3) {
        nilaiRata2 = (mhs1 + mhs2 + mhs3) / 3;
        return nilaiRata2;
    }
}