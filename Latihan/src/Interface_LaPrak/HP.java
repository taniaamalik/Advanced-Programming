package Interface_LaPrak;

interface Hp {

    public void mengirimPesan();
    public void menerimaPesan();
    public void panggilanTelepon();

}

class Samsung implements Hp {
    public void kalkulator() {
        System.out.println("hp ini terdapat kalkulator");
    }

    public void mengirimPesan() {
        System.out.println("dapat mengirim pesan");
    }

    public void menerimaPesan() {
        System.out.println("dapat menerima pesan");
    }

    public void panggilanTelepon() {
        System.out.println("dapat melakukan panggilan telepon");
    }
}

class Nokia implements Hp {
    public void simpanBiodata() {
        System.out.println("dapat menyimpan biodata");
    }

    public void mengirimPesan() {
        System.out.println("dapat mengirim pesan");
    }

    public void menerimaPesan() {
        System.out.println("dapat menerima pesan");
    }

    public void panggilanTelepon() {
        System.out.println("dapat melakukan panggilan telepon");
    }
}

class Iphone implements Hp {
    public void menulisCatatan() {
        System.out.println("dapat menulis catatan");
    }

    public void mengirimPesan() {
        System.out.println("dapat mengirim pesan");
    }

    public void menerimaPesan() {
        System.out.println("dapat menerima pesan");
    }

    public void panggilanTelepon() {
        System.out.println("dapat melakukan panggilan telepon");
    }
}

/*class Main{
    public static void main(String[] args) {
        System.out.println("---Samsung---");
        Samsung s = new Samsung();
        s.kalkulator();
        s.mengirimPesan();
        s.menerimaPesan();
        s.panggilanTelepon();
        System.out.println("---Nokia---");
        Nokia n = new Nokia();
        n.simpanBiodata();
        n.mengirimPesan();
        n.menerimaPesan();
        n.panggilanTelepon();
        System.out.println("---Iphone---");
        Iphone i = new Iphone();
        i.menulisCatatan();
        i.mengirimPesan();
        i.menerimaPesan();
        i.panggilanTelepon();
    }
}*/

class test {

    public static void main(String[] args) {
        HP[] hp = new HP[3];
        System.out.println("SAMSUNG");
        hp[0] = new samsung();
        System.out.println("\nNOKIA");
        hp[1] = new nokia();
        System.out.println("\nIPHONE");
        hp[2] = new iphone();
    }
}

interface HP {

    void asal();

    void pesan();

    void telfon();
}

class samsung implements HP {

    public samsung() {
        calculator();
        pesan();
        telfon();
        asal();
    }

    void calculator() {
        System.out.println("ini kalkulator cuma punya samsung");
    }

    @Override
    public void pesan() {
        System.out.println("omg bisa send and receive mssg");
    }

    @Override
    public void telfon() {
        System.out.println("omg bisa nelfon");
    }

    @Override
    public void asal() {
        System.out.println("OMG DARI KOREA");
    }

}

class nokia implements HP {

    public nokia() {
        simpanbiodata();
        pesan();
        telfon();
        asal();
    }

    void simpanbiodata() {
        System.out.println("simpanbiodata nokia");
    }

    @Override
    public void pesan() {
        System.out.println("omg bisa send and receive mssg");
    }

    @Override
    public void telfon() {
        System.out.println("omg bisa nelfon");
    }

    @Override
    public void asal() {
        System.out.println("Omg dari finland");
    }
}

class iphone implements HP {

    public iphone() {
        notes();
        pesan();
        telfon();
        asal();
    }

    void notes() {
        System.out.println("notes iphone punya");
    }

    @Override
    public void pesan() {
        System.out.println("omg bisa send and receive mssg");
    }

    @Override
    public void telfon() {
        System.out.println("omg bisa nelfon");
    }

    @Override
    public void asal() {
        System.out.println("omfg dari california");
    }
}
