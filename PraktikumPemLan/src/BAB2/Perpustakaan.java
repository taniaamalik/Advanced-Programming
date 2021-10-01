package BAB2;

public class Perpustakaan {

    private String kategori;
    private String judul;
    private String penulis;
    private String sinopsis;
    private String tingkatKesamaan;

    Perpustakaan(String ktgri, String jdl, String pnls, String snpss) {
        this.kategori = ktgri;
        this.judul = jdl;
        this.penulis = pnls;
        this.sinopsis = snpss;
    }

    public int hitungJumlahKata(String jk) {
        String[] kata = jk.split(" ");
        return kata.length;
    }

    public void tingkatKesamaan(Perpustakaan tk) {
        int tingkatKesamaan = 0;
        if (kategori.equalsIgnoreCase(tk.kategori))
            tingkatKesamaan += 25;
        if (judul.equalsIgnoreCase(tk.judul))
            tingkatKesamaan += 25;
        if (penulis.equals(tk.penulis))
            tingkatKesamaan += 25;
        if (sinopsis.equals(tk.sinopsis))
            tingkatKesamaan += 25;
        System.out.println("Tingkat Kesamaan Buku " + judul +" & Buku " + tk.judul + " : "+ tingkatKesamaan + "%");
    }

    public void Copy(Perpustakaan copy) {
        kategori = copy.kategori;
        judul = copy.judul;
        penulis = copy.penulis;
        sinopsis = copy.sinopsis;
        getPerpus();
    }

    public void getPerpus() {
        System.out.println("Kategori : " + kategori);
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("Jumlah Kata : " + hitungJumlahKata(sinopsis));
        System.out.println("=======================================================================================================================================================================================");
    }
}