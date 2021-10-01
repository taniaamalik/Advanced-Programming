package Tugas3;

public class Rental {

    final int denda = 2000;
    final int batas_pinjam = 7;
    private String Nama;
    private String no_identitas;
    private String kategori_CD;
    private String x;
    private int tgl_pinjam;
    private int tgl_kembali;
    private int pinjam;
    private int lama_peminjaman;
    private int total;
    
    public void setNama(String nama) {
        Nama = nama;
    }

    public void setno_Identitas(String noIdentitas) {
        no_identitas = noIdentitas;
    }
    
    public void setkategori_CD(int kategoriCD) {
        switch(kategoriCD){
            case 1:
                x="Film";
                break;
            case 2:
                x="Musik";
                break;
            case 3:
                x="Edukasi";
                break;
            default:
                System.out.println("Maaf, Kategori yang Anda Pilih Tidak Ada");
                System.exit(0);
        }
        kategori_CD = x;
    }

    public void settgl_pinjam(int tglPinjam) {
        tgl_pinjam = tglPinjam;
    }

    public void settgl_kembali(int tglKembali) {
        tgl_kembali = tglKembali;
    }

    public String getNama() {
        return Nama;
    }

    public String getno_identitas() {
        return no_identitas;
    }

    public String getkategori_CD() {
        return kategori_CD;
    }

    public int gettgl_pinjam() {
        return tgl_pinjam;
    }

    public int gettgl_kembali() {
        return tgl_kembali;
    }

    public int getlama_peminjaman(int tglKembali, int tglPinjam) {
        lama_peminjaman = tglKembali - tglPinjam;
        return lama_peminjaman;
    }

    public int gettotal() {
        if (lama_peminjaman > batas_pinjam) {
            total = (lama_peminjaman - batas_pinjam) * denda;
        } else {
            total = 0;
        }
        return total;
    }
}