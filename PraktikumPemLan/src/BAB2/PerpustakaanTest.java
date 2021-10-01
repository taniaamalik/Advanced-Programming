package BAB2;

public class PerpustakaanTest {

    public static void main(String[] args) {
        Perpustakaan tek1 = new Perpustakaan("Teknologi", "Merajut jejaring teknologi informatika, komunikasi, dan media massa", "Arifianto, S.", "Buku ini berisi tentang jejaring dari teknologi informatika, komunikasi, dan media massa");
        Perpustakaan tek2 = new Perpustakaan("Teknologi", "Teknologi informasi perpustakaan = strategi perancangan perpustakaan digital", "Muhsin,Ahmad","Buku ini berisi tentang strategi-strategi bagaminan cara merancang perpustakaan dalam bentuk digital");
        Perpustakaan fik1 = new Perpustakaan("Fiksi", "Manusia Setengah Salmon", "Dika, Raditya", "Buku ini berisi tentang lika-liku kisah cinta Dika dan tentang keluarga");
        Perpustakaan fik2 = new Perpustakaan("Fiksi", "Marmut Merah Jambu", "Dika, Raditya", "Buku ini berisi tentang kisah cinta pertama Dika saat SMA dan tentang persahabatan");
        
        tek1.getPerpus();
        tek1.Copy(tek1);
        tek2.getPerpus();
        tek2.Copy(tek2);
        tek1.tingkatKesamaan(tek2);
        System.out.println();
        
        fik1.getPerpus();
        fik1.Copy(fik1);
        fik2.getPerpus();
        fik2.Copy(fik2);
        fik1.tingkatKesamaan(fik2);
        System.out.println();
        
        tek1.getPerpus();
        tek1.Copy(tek1);
        fik1.getPerpus();
        fik1.Copy(fik1);
        tek1.tingkatKesamaan(fik1);
        System.out.println();
        
        tek2.getPerpus();
        tek2.Copy(tek2);
        fik2.getPerpus();
        fik2.Copy(fik2);
        tek2.tingkatKesamaan(fik2);
        System.out.println();
        
        tek1.getPerpus();
        tek1.Copy(tek1);
        fik2.getPerpus();
        fik2.Copy(fik2);
        tek1.tingkatKesamaan(fik2);
        System.out.println();
        
        tek2.getPerpus();
        tek2.Copy(tek2);
        fik1.getPerpus();
        fik1.Copy(fik1);
        tek2.tingkatKesamaan(fik1);
        System.out.println();
    }
}