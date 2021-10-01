package StaticModifier_LaPrak;

public class Test2 {
    public static void main(String[] args) {
        Akun2 mahasiswa1 = new Akun2();
        Akun2 mahasiswa2 = new Akun2();
        
        mahasiswa1.buku=4;
        mahasiswa2.buku=7;
        mahasiswa1.papanTulis=8;
        
        System.out.println(mahasiswa1.buku);
        System.out.println(mahasiswa2.buku);
        System.out.println(mahasiswa1.papanTulis);
        System.out.println(mahasiswa2.papanTulis);
    }
}

class Akun2{
    static int papanTulis;
    int buku;
}
//STATIC LANGSUNG DIPANGGIL AJA