package BAB32;

public class LIngkaranMain {

    public static void main(String[] args) {
        lingkaran Lstring = new lingkaran("6","5");
        System.out.println("Alas   = " + Lstring.getAlas() + " diubah ke integer menjadi : " + Lstring.parseAlas(Lstring.getAlas()));
        System.out.println("Tinggi = " + Lstring.getTinggi() + " diubah ke integer menjadi : " + Lstring.parseTinggi(Lstring.getTinggi()));
        lingkaran l = new lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();
        lingkaran l2 = new lingkaran(4, 10);
        l2.displayMessage();
    }
}