package co.g2academy;

public class ThisExample {
    int num = 10;
    ThisExample() {
        System.out.println("This is an example program in keyword this");
    }

    ThisExample(int num) {
        this(); // invoking the default constructor
        this.num = num;
    }

    public static void greet() {
        System.out.println("Hi Hello to Java");

    }

    public void print() {
        int num = 20; //Local Varialble
        System.out.println("Value of Local Variable is " + num);  //Printing the local variable
        System.out.println("Value of instance variable is " + this.num);
        this.greet(); //invoking the greet method of the class
    }

    public static void main(String[] args) {
        ThisExample obj1 = new ThisExample();
        obj1.print();

        ThisExample obj2 = new ThisExample(30);
    }

}
