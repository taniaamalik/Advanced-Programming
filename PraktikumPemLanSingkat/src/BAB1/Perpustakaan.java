package BAB1;

public class Perpustakaan {

    private int JenisBuku;
    String x;
    
    public void KategoriBuku(){
        System.out.println("Kategori Buku =");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi");
    }
    public void setJenisBuku(int jenisbuku){
        switch(jenisbuku){
            case 1:
                x = "Kategori Buku = Teknologi";
                Teknologi();
                break;
            case 2:
                x="Kategori Buku = Filsafat";
                Filsafat();
                break;
            case 3:
                x="Kategori Buku = Sejarah";
                Sejarah();
                break;
            case 4:
                x="Kategori Buku = Agama";
                Agama();
                break;
            case 5:
                x="Kategori Buku = Psikologi";
                Psikologi();
                break;
            case 6:
                x="Kategori Buku = Politik";
                Politik();
                break;
            case 7:
                x="Kategori Buku = Fiksi";
                Fiksi();
                break;
            default:
                x="Maaf, Kategori buku yang dipilih tidak ada";
        }
    }
        
 
    public int getJenisBuku(){
        return JenisBuku;
    }
    

    public String Teknologi() {
        String[][] teknologi = {{"Merajut jejaring teknologi informatika, komunikasi, dan media massa", "Arifianto, S."},
        {"Sistem Teknologi Informasi, Pendekatan terintegrasi : Konsep dasar, teknologi, aplikasi, pengembangan dan pengelolaan", "Hartono, Jogiyanto"},
        {"Teknologi informasi perpustakaan : strategi perancangan perpustakaan digital", "Muhsin,Ahmad"},
        {"Kumpulan materi : pelatihan teknologi informasi (IT), Universitas Brawijaya, 21-26 Juni 2004", "Tolle, Herman"},
        {"Buku pintar Linux : open source Linux, membangun kekuatan baru teknologi informasi dunia", "Indraji, Ardiansyah"}};
        for (int i = 0; i < teknologi.length; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.println("=====================================================================================================================");
            System.out.println("Judul : " + teknologi[i][0]);
                System.out.println("Penulis : " + teknologi[i][1]);
            }
        }
        return x;
    }

    public String Filsafat() {
        String[][] Filsafat = {{"Ilmu sejarah dan filsafat", "Meulen, W.J. van der"},
        {"Filsafat Pendidikan", "Suhartono, Suparlan"}, {"Filsafat Hukum Perdata dalam tanya jawab", "Halim,A. Ridwan"},
        {"Pengantar filsafat pendidikan islam", "Marimba, Ahmad D."}, {"Sosiologi dan filsafat", "Durkheim, Emile"}};
        for (int i = 0; i < Filsafat.length; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.println("=====================================================================================================================");
            System.out.println("Judul : " + Filsafat[i][0]);
                System.out.println("Penulis : " + Filsafat[i][1]);
            }
        }
        return x;
    }

    public String Sejarah() {
        String[][] Sejarah = {{"Hukum islam dalam perspektif sejarah", "Ahmad, Hamid"},
        {"Sejarah pergerakan rakyat Indoesia", "Pringgodigdo,A.K."},
        {"Lintas Sejarah Imigrasi Indonesia", "Ramadhan K.H."}, {"Sejarah perkembangan ilmu ekonomi", "Winardi"},
        {"Pengantar sejarah perekonomian dunia : akhir abad pertengahan sampai perang dunia II", "Harjosubroto, Sudinar"}};
        for (int i = 0; i < Sejarah.length; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.println("=====================================================================================================================");
            System.out.println("Judul : " + Sejarah[i][0]);
                System.out.println("Penulis : " + Sejarah[i][1]);
            }
        }
        return x;
    }

    public String Agama() {
        String[][] Agama = {{"Agama dan perubhan sosiopolitik", "Esposito, John L."},
        {"Islam Akomodatif : Rekonstruksi pemahaman Islam sebagai Agama Universal", "Yasid, Abu"},
        {"Kompetensi Pengadilan Agama terhadap tindak kekerasan dalam rumah tangga", "Samadani, U.Adil"},
        {"Al=Qur'an dan pluralisme agama", "Qaramaliki, Muhammad Hasan Qadrdan"}, {"Nasihat-naasihat agama Islam", "Haddad, Abdulloh Ba'Alawi Al."}};
        for (int i = 0; i < Agama.length; i++) {    
            for (int j = 1; j < 2; j++) {
                System.out.println("=====================================================================================================================");
            System.out.println("Judul : " + Agama[i][0]);
                System.out.println("Penulis : " + Agama[i][1]);
            }
        }
        return x;
    }

    public String Psikologi() {
        String[][] Psikologi = { {"Psikologi untuk keperawatan", "Sunaryo"}, {"Psikologi Pendidikan", "Martaniah, Sri Mulyani"},
        {"Psikologi abnormal", "Greene, Beverly"}, {"Psikologi kepribadian", "Hadi, Taufik"}, {"Psikologi sosial", "Clayton, Debbie"}};
        for (int i = 0; i < Psikologi.length; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.println("=====================================================================================================================");
            System.out.println("Judul : " + Psikologi[i][0]);
                System.out.println("Penulis : " + Psikologi[i][1]);
            }
        }
        return x;
    }

    public String Politik() {
        String[][] Politik = {{"Analisa politik modern", "Dahl, Robert A."},
        {"Konsesus politik nasional orde baru : ortodoksi dan aktualisasinya", "Silalahi, Harry Tjan"},
        {"Tafsir politik : Interpretasi hermeneutis wacana sosial-politik kontemporer", "Gibbon, Michael T"},
        {"Pengantar teori politik ekonomi", "Winardi"}, {"Pemikiran politik Indonesia 1945-1985"}};
        for (int i = 0; i < Politik.length; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.println("=====================================================================================================================");
            System.out.println("Judul : " + Politik[i][0]);
                System.out.println("Penulis : " + Politik[i][1]);
            }
        }
        return x;
    }

    public String Fiksi() {
        String[][] Fiksi = {{"Melbourne(Rewind", "Efendi, Winna"}, {"Manusia Setengah Salmon", "Dika, Raditya"},
        {"Pillow Talk", "Simamora, Christian"}, {"Malam Tanpa Akhir", "Manis, Hoeda"}, {"99 Cahaya di langit Eropa", "Rais, Hanum Salsabiela"}};
        for (int i = 0; i < Fiksi.length; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.println("=====================================================================================================================");
            System.out.println("Judul : " + Fiksi[i][0]);
                System.out.println("Penulis : " + Fiksi[i][1]);
            }
        }
        return x;
    }
}