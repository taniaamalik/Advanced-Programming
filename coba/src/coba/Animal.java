package coba;

abstract class Animal {
    abstract void BerkembangBiak();
}

class Mamalia extends Animal{
    void BerkembangBiak(){
        System.out.println("beranak");
    }
    boolean berbulu(){
        return false;
    }
}

class Aves extends Animal{
    void BerkembangBiak(){
        System.out.println("bertelur");
    }
        boolean berbulu(){
            return true;
        }
    public static void main(String[] args) {
//        Animal kuda = new Mamalia();
//        Animal ayam = new Aves();
//        ayam = kuda;
//        boolean status = ((Mamalia)ayam).berbulu();
//        System.out.println(status);

        Animal hewan;
        hewan = new Mamalia();
        hewan.BerkembangBiak();
        hewan = new Aves();
        hewan.BerkembangBiak();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         