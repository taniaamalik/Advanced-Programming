package Inheritence_PemLan;

public class Latihan {
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Budi",'L');
        Mahasiswa mhs1 = new Mahasiswa(1234,"TIF","Deni",'L');
       System.out.println("Nama mhs1 : " +mhs1.getNama()); //mewarisi dari mhs
    }
}