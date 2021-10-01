package Inheritence_PemLan;

public class Manusia {
    private String Nama;
    private char JK;
    
    public Manusia(String Nama, char jk){
        this.Nama = Nama;
        this.JK = jk;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setJK(char jk) {
        this.JK = JK;
    }

    public String getNama() {
        return Nama;
    }

    public char getJK() {
        return JK;
    }
}