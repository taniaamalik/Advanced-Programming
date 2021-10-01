package BAB1;

public class Perpustakaan {

    private String kategori;
    private String judul;
    private String[] penulis = new String[2];

    public void setPerpus(String a, String b, String c1, String c2) {
        this.kategori = a;
        this.judul = b;
        this.penulis[0] = c1;
        this.penulis[1] = c2;
    }

    public void getPerpus() {
        System.out.println("Kategori : " + kategori);
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis[0]);
        System.out.printf("\t   %s\n\n", penulis[1]);
    }
}