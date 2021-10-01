package uap;

public class DataLogin implements login{
    private String namaUser1="mhs";
    private String pass1="mahasiswa";
    private String namaUser2="mahasiswa";
    private String pass2="praktikum";

    @Override
    public boolean validasi(String nama, String pass) {
        boolean x = true;
        if(nama.equalsIgnoreCase(" ") && pass.equalsIgnoreCase(" ")) {
            return false;
        }else{
            return x;
        }
    }

    @Override
    public boolean cekData(String nama, String pass) {
       if(nama.equalsIgnoreCase("mhs") && pass.equalsIgnoreCase("mahasiswa") || (nama.equalsIgnoreCase("mahasiwa") && pass.equalsIgnoreCase("praktikum"))){
           return true;
       }else{
           return false;
       }
    }
    
}