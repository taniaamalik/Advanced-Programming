package uap1;

public class Main {
    public static void main(String[] args) {
        Bank bank[] = new Bank[3];
        bank[0] = new bronze("taniairyana","123");
        bank[1] = new silver("malikiryana","456");
        bank[2] = new gold("taniamalik","789");
        for (int i = 0; i < bank.length; i++) {
            System.out.println(bank[i]);
            System.out.println("----------------------");
        }
    }
}