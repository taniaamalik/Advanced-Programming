package uap1;

public abstract class Bank {
    private String userName;
    private String Pass;
    
    public Bank(String un, String pass){
        this.userName = un;
        this.Pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public String getPass() {
        return Pass;
    }
    
    public abstract double penarikanUang();
    public abstract double transfer();
    
    public String toString(){
        return "UserName : " + userName + "\nPassword : " + Pass;
    }
    
}