package co.g2academy.basic;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person (String name , String address) {
        this.name = name;
        this.address = address;
    }

    Person (String name) {
        this(name, null);
    }

    Person () {
        this(null);
    }

    void sayHello (String name) {
        System.out.println("Hello " + name );
        System.out.println("My Name is " + this.name);
        System.out.println(("I From  : " + this.address + this.country));
        System.out.println("Welcome to My Program");

    }
}
