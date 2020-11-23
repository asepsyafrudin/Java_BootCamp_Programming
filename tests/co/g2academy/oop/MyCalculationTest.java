package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculationTest {
    MyCalculation myCalculation = new MyCalculation();

    @Test
    public void testAddition() {
        myCalculation.addition(1,10);
        int action = myCalculation.z;
        assertEquals(11, action);

    }

    @Test
    public void testSubstaction() {
        Calculation calculation = new MyCalculation();
        calculation.subsraction(9, 2);
        int action = calculation.z;
        assertEquals(7,action);
    }

    @Test
    public void testMultiplication() {
        myCalculation.multiplication(1,10);
        int action = myCalculation.z;
        assertEquals(10, action);

    }
}




