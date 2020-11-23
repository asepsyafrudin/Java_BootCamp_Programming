package co.g2academy.exception;

public class AgeValidate {
    public boolean validate (int age) {
        if(age <18) {
            throw new ArithmeticException("Age is Not Valid");
        } else {
            return true;
        }
    }
}
