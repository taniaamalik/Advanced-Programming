package Inheritance_LaPrak3;

public class MakhlukHidup { //paling atas sudah terdapat default, public class MakhlukHidup extends Object{
   MakhlukHidup(){
       super();
       System.out.println("ini constructor makhluk hidup");
   }
   }

class Hewan extends MakhlukHidup{
    Hewan(){
        super();
        System.out.println("ini constructor hewan");
    }
    boolean bernapas = true;
    boolean makan = true;
}

class Sapi extends Hewan{
//    Sapi(){
//        super.bernapas = true; //anak mau mengakses ke superclass atau induknya
//    }
//    Sapi(){
//       //kalo kosong ini ada default, super();
//    }
    String bunyi;
    Sapi(){
        super();
        System.out.println("ini konstruktor sapi");
       // super.bernapas=true;
    }
    public static void main(String[] args) {
       // Sapi sapi = new Sapi();
       // Hewan h = new Sapi(); //object sapi boleh diseimpen ditipe data induknya, fungsi dikelas sapi akan hilang mis diatribut sapi punya bunyi gaakan keluar pas dipanggil h.bunyi, jd dia hanya punya diobject sapi yaitu napas dan makan
       // Sapi m= new Hewan(); gaboleh karna hewan punya atribut napas dan makan ntar java bingung karna sapi hanya punya bunyi, bunyinya dikosongin apa ga
      // Sapi m = (Sapi) h;//harus dicast kan diatas tipe data hewan, masukin dulu ketipe data sapi //downcasting, harus dibuat variable dulu
     
      //downcasting
      Hewan h = new Sapi();
      Hewan n = new Sapi();
      Sapi k = (Sapi) n; //downcasting 
      //cara mau nampilin bunyi
     k.bunyi="mooo";
      
      //array
      /*Hewan[] m = new Hewan[3];
      m[0] = new Sapi();
      m[1] = new Sapi();*/
      Hewan[] m = {new Sapi(), new Sapi(), new Hewan()};
      
     /* Hewan[] m = {new Sapi());
      Sapi j = (Sapi) m[0];*/
    }
}