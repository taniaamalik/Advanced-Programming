package BAB12;

public class noSembilan {

    static int lembar, menulis, totalHari;

    public static void main(String[] args) {
        buku();
        hari();

    }

    public static void buku() {
        lembar = 50;
        menulis = 4;
    }

    public static int hari() {
        totalHari = lembar * menulis;
        System.out.println("Lama Mahasiswa A menghabiskan 1 buku adalah " + totalHari + " hari");
        return totalHari;
    }
}