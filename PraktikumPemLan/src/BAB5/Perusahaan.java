package BAB5;

public class Perusahaan {
    private final int hargaJaket;
    private final int hargaDiscjaket;
    private int total;

    public Perusahaan(int hj, int hdj) {
        this.hargaJaket = hj;
        this.hargaDiscjaket = hdj;
    }

    public void beliJaketA(int a) {
        if (a > 100) {
            total = hargaDiscjaket * a;
        } else {
            total = hargaJaket * a;
        }
        System.out.println("Total Harga Jaket A : " + total);
    }

    public void beliJaketB(int b) {
        if (b > 100) {
            total = hargaDiscjaket * b;
        } else {
            total = hargaJaket * b;
        }
        System.out.println("Total Harga Jaket B : " + total);
    }

    public void beliJaketC(int c) {
        if (c > 100) {
            total = hargaDiscjaket * c;
        } else {
            total = hargaJaket * c;
        }
        System.out.println("Total Harga Jaket C : " + total);
    }
}