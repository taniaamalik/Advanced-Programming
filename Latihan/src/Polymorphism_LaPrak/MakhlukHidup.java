package Polymorphism_LaPrak;

public abstract class MakhlukHidup {
    abstract void berjalan();
    void bernapas(){ //bisa nyimpen method gaabstract
        System.out.println("Makhluk Hidup bernapas");
    }
}

class Manusia extends MakhlukHidup{
    //harus diovveride biar gaerror
    void berjalan(){
        System.out.println("Berjalan dengan dua kaki");
    }
    //kalau gamau deklarasiin method abstract berjalan tambahin abstract dikelas manusia extend mh
}

class Kucing extends MakhlukHidup{
    void berjalan(){
        System.out.println("Berjalan dengan empat kaki");
    }
}

class Main{
    public static void main(String[] args) {
       /* Manusia[] m = new Manusia[3]; //hanya bikin array
        Manusia m = new Manusia();  //gabisa dijadiin object karena terlalu general*/
       Kucing k = new Kucing();
    }
}