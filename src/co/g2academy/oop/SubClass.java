package co.g2academy.oop;

public class SubClass extends SuperClass{
    int num = 10;
    public void display() {
        System.out.println("This is the display of subclass");

    }

    public void myMethod() {
        this.display();
        super.display();
        System.out.println("Value of variable named num in subclass : " + this.num);
        System.out.println("Value of variable named num in superclass : " + super.num);
    }

    public static void main(String[] args) {
        //animous object
        new SubClass().myMethod();
    }
}
