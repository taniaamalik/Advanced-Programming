package Mahasiswa;

public class Mahasiswa {
	private String nim;
	private String nama;
	private String angkatan;
	static int jmlMhs = 0;
	
	public Mahasiswa(String a, String b, String c) {
		nama = a;
		nim = b;
		angkatan = c;
		jmlMhs++;
	}
	
	public void displayInfo() {
		System.out.println("Nama: " + nama);
		System.out.println("NIM: " + nim);
		System.out.println("Angkatan: " + angkatan);
	}
	
	public static int JumlahMahasiswa() {
		return jmlMhs;
	}
	
}