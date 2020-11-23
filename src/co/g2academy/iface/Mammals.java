package co.g2academy.iface;

public class Mammals implements IAnimal{
    public void eat() {
        System.out.println("Mammals Eat");
    }
    public void travel() {
        System.out.println("Mammals Travel");
    }

    public int noOfLegs(){
        return 0;
    }

    public  static void main(String[] args) {
        Mammals mammals = new Mammals();
        mammals.eat();
        mammals.travel();
        mammals.noOfLegs();
    }
}
