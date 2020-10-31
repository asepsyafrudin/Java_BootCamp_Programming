package co.g2academy.unit.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetRockTest {

        PetRock rocky = new PetRock("rocky");

    @Test
    public void getName() {

        String actual = rocky.getName();
        assertEquals("rocky", actual);
    }

    @Test
    public void testUnHappyToStart() {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay () {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }


}