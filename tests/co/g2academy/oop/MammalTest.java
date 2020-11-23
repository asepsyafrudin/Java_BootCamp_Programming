package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MammalTest {

    @Test
    public void testMethodOveriding() {
        Mammal mammal = new Mammal();
        String action1 = mammal.move();
        assertEquals("Mammal can walk and run", action1);


        Animal animal = new Animal();
        String action2 = animal.move();
        assertEquals("Animals can move", action2);
    }





}