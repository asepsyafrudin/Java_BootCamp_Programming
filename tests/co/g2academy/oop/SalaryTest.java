package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryTest {
    @Test
    public void testPolimorphismMethod() {
        Employee employee = new Employee("Asep Syafrudin", "Jakarta", 101);
        String action1 = employee.mailCheck();
        assertEquals("Mailing a check to Asep Syafrudin Jakarta", action1);

        Employee salary = new Salary("Putri", "Jakarta", 102, 1200);
        String actual = salary.mailCheck();
        assertEquals("Within mailCheck of salary class. Mailing a check to Putri Jakarta", actual);
    }

    @Test
    public void testAvoidSettingSalary() {
        Salary salary = new Salary("Asep Syafrudin", "Jakarta", 101, 1200);
        salary.setSalary(-1);
        double actual = salary.getSalary();
        assertEquals(Double.valueOf(1200), Double.valueOf(actual));

    }
}