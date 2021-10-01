package uap1;

public class silver extends Bank{

    public silver(String un, String pass) {
        super(un, pass);
    }

    @Override
    public double penarikanUang() {
       return 10000000; 
    }

    @Override
    public double transfer() {
      return 2500;
    }
    
}