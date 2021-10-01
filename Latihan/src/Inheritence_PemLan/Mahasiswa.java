package Inheritence_PemLan;

public class Mahasiswa extends Manusia{
    private int Nim;
    private String Jurusan;
    
    public Mahasiswa(int nim, String jurusan, String Nama, char JK){
        super(Nama, JK);
        this.Nim = nim;
        this.Jurusan = jurusan;
        
    }

    public void setNim(int Nim) {
        this.Nim = Nim;
    }

    public void setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
    }

    public int getNim() {
        return Nim;
    }

    public String getJurusan() {
        return Jurusan;
    }   
}