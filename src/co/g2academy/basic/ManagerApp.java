package co.g2academy.basic;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");

        var visePresident = new VisePresident();
        visePresident.name = "Asep";
        visePresident.sayHello("Budi");



    }
}
