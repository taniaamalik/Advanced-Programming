package quizpemlan;

public class KebunBinatangTest {

    public static void main(String[] args) {
       KebunBinatang kb1 = new KebunBinatang("Zebra","Tumbuhan",50,50,120,30);
       kb1.displayMessage1();
       KebunBinatang kb2 = new KebunBinatang("Singa","Daging",90,70,140,50);
       kb2.displayMessage1();
       KebunBinatang kb3 = new KebunBinatang("Kuda","Tumbuhan",70,80,130,60);
       kb3.displayMessage1();
       
       KebunBinatang tnm1 = new KebunBinatang("Apel","Buah",10,4);
       KebunBinatang tnm2 = new KebunBinatang("Mangga","Buah",11,3);
       KebunBinatang tnm3 = new KebunBinatang("Tomat","Sayur",2,2);
    }
}