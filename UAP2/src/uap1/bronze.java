package uap1;

public class bronze extends Bank{

    public bronze(String un, String pass) {
        super(un, pass);
    }

    @Override
    public double penarikanUang() {
        return 2000000;
    }

    @Override
    public double transfer() {
        return 5000;
    }
    
}