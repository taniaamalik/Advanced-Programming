package Inheritance_LaPrak;

//Agregasi
public class Jurusan {
    Mahasiswa[] mahasiswa;
    
    public void addMahasiswa(int index, Mahasiswa m) {
        mahasiswa[index] = m;
    }
    
    public static void main(String[] args) {
        Jurusan TeknikInformatika = new Jurusan();
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa();
        Mahasiswa m3 = new Mahasiswa();
        
        TeknikInformatika.addMahasiswa(0, m1);
        TeknikInformatika.addMahasiswa(1, m2);
        TeknikInformatika.addMahasiswa(2, m3);
        
       // mobil.addRoda("michelin");
    }
}

class Mahasiswa {
    String nim;
}

//Komposisi
class Mobil {
    Roda roda;
    
    void addRoda (String merek) {
        roda = new Roda();
        roda.merek = merek;
    }
}

class Roda {
    String merek;
}