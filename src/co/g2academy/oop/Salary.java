package co.g2academy.oop;

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double setSalary) {
        super(name, address, number);
        setSalary(setSalary);
    }

    public String mailCheck () {
        return "Within mailCheck of salary class. " + super.mailCheck();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary >= 0.0) {
            this.salary = salary;
        }
    }

    public double computePay () {
        return salary/52;
    }

}
