package coba;

class Pegawai {
    public void bekerja(){
        System.out.println("pegawai bekerja");
    }
    public boolean status(){
        return true;
    }
}

class Sekretaris extends Pegawai{
    public void bekerja(){
        System.out.println("mengarsip surat");
    }
    public void startBekerja(){
        bekerja();
    }
    public static void main(String[] args) {
        Sekretaris baru = new Sekretaris();
        baru.startBekerja();
    }
}