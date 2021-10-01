package Polymorphism_LaPrak;

public abstract class BangunDatar {
    int sisi;
    int panjang;
    int lebar;
    int luas;
    int keliling;
    
    abstract void hitungLuas();
    abstract void hitungKeliling();
}
class Persegi extends BangunDatar{
    void hitungLuas(){
        super.luas = super.panjang * super.lebar;
    }
    void hitungKeliling(){
        super.keliling = 4 * super.sisi;
    }
}

class Lingkaran extends BangunDatar{
    void hitungLuas(){
        super.luas = (int) 3.14*(super.panjang/2)*(super.panjang);
    }
    void hitungKeliling(){
        super.keliling = (int) 3.14*super.panjang;
    }
}