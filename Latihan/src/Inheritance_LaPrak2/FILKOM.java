package Inheritance_LaPrak2;

public class FILKOM {

    FILKOM() {
        System.out.println("ini FILKOM");
    }
}

class Dosen extends FILKOM {

    Dosen() {
        System.out.println("ini Dosen");
    }
}

class Mahasiswa extends FILKOM {

    Mahasiswa() {
        System.out.println("ini Mahasiswa");
    }
}

class Staff extends FILKOM {

    Staff() {
        System.out.println("ini Staff");
    }
}

class Administratif extends Staff {

    Administratif() {
        System.out.println("ini staff administartif");
    }
}

class Keuangan extends Staff {

    Keuangan() {
        System.out.println("ini staff keuangan");
    }
}

class Keamanan extends Staff {

    Keamanan() {
        System.out.println("ini staff keamanan");
        
    }
    public static void main(String[] args) {
        Keamanan b=new Keamanan();
        Keuangan c=new Keuangan();
        Administratif d=new Administratif();
        //super.super.Attribut
    }
}