package BAB22;

public class Student {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    public Student() {
        name = "";
        address = "";
        age = 0;
    }

    Student(int math, int english, int science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }
    
    public boolean statusAkhir(){
        return getAverage()>=61;
    }
    
    static int jmlhObjek;

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jmlhObjek++;
    }

    public void setName(String n) {
        name = n;
        jmlhObjek++;
    }
    public static void jumlahObjek(){
        System.out.println("jumlah objek " + jmlhObjek);
    }
    
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        System.out.println("status akhir "+ (statusAkhir()==true?"lolos":"remidi"));
    }
}