package Polymorphism_LaPrak;

public abstract class Kendaraan {
    abstract void berjalan();
    abstract void menaikkanP();
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Beroda 4");
    }
    void menaikkanP() {
        System.out.println("Buka pintu mobil dan menaiki mobil");
    }
}

class Motor extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Beroda 2");
    }
    void menaikkanP() {
        System.out.println("memakai helm dan naik motor");
    }
}

class Pesawats extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Beroda 3");
    }
    void menaikkanP() {
        System.out.println("naik ke pesawat");
    }
}

class main {
    public static void main(String[] args) {
        Kendaraan[] k = new Kendaraan[3];
        Mobil car = new Mobil();
        Motor motor = new Motor();
        Pesawats air = new Pesawats();
        k[0] = car;
        k[1] = motor;
        k[2] = air;
        for (int i = 0; i < k.length; i++) {
            k[i].berjalan();
            k[i].menaikkanP();
        }
    }
}