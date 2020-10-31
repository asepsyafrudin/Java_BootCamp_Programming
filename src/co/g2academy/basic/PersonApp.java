package co.g2academy.basic;

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Asep Syafrudin" , "Jakarta Pusat");
        person1.sayHello("Computer");

        Person person2 = new Person("Jaka");
        person2.sayHello("Computer");

        Person person3;
        person3 = new Person();
        person3.name = "Budi";
        person3.address= "Jakarta";
        person3.sayHello("Computer");

    }
}
