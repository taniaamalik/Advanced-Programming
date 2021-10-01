package coba;

class Human {
    String name;
}
abstract class Superhuman extends Human implements Flyable{
    
}

interface Flyable{
    public void fly();
}
interface Powerfull extends Flyable{
    public void unbeatable();
}
class UniverseGame{
    public static void main(String[] args) {
    }
}