package uap1;

public class gold extends Bank{

    public gold(String un, String pass) {
        super(un, pass);
    }

    @Override
    public double penarikanUang() {
       return 0;
    }

    @Override
    public double transfer() {
      return 0;
    }
    
}