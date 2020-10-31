package co.g2academy.basic;

public class TestGreeting {
    public static void main(String[] args) {
       Greeting asep = new Greeting();
       asep.name = "asep";
       asep.greet();
       Greeting putri = new Greeting();
       putri.name = "Putri";
       putri.greet();
    }
}