package co.g2academy.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsATest {

    @Test
    public void testMammalIsAnimal() {
        Mammal mammal = new Mammal();
        assertTrue(mammal instanceof Animal);
    }

    @Test
    public void testDogisAnimal() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Animal);
    }

    @Test
    public void testDogisMammal() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Mammal);
    }
}