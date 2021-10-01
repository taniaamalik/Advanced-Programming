package Kuliah;

public class Ruang {
	private String nama;
	private String gedung;
	private int kapasitas;
	static int jmlRuang = 0;

	public Ruang(String a, String b, int c) {
		nama = a;
		gedung = b;
		kapasitas = c;
		jmlRuang++;
	}

	public void displayInfo() {
		System.out.println("Nama: " + nama);
		System.out.println("Gedung: " + gedung);
		System.out.println("Kapasitas: " + kapasitas);
	}

	public static int JumlahRuang() {
		return jmlRuang;
	}

}