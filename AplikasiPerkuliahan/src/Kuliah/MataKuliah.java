package Kuliah;

public class MataKuliah {
	private String kode;
	private String nama;
	private int sks;
	static int jmlMK = 0;
	
	public MataKuliah(String a, String b, int c) {
		nama = a;
		kode = b;
		sks = c;
		jmlMK++;
	}
	
	public void displayInfo() {
		System.out.println("Nama: " + nama);
		System.out.println("Kode: " + kode);
		System.out.println("SKS: " + sks);
	}
	
	public static int JumlahMataKuliah() {
		return jmlMK;
	}
	
}
