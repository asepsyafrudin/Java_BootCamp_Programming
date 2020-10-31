package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTwoDimensionTest {

        ArrayTwoDimension array = new ArrayTwoDimension();
    @Test
    public void testArrayTwoDimension() {
        int[][] action = array.getTwoDim();
        assertNotNull(action);
        assertEquals(4, action.length);
        assertEquals(5 , action[0].length);
        assertEquals(5 , action[1].length);
        assertNull(action[2]);
    }

    @Test
    public void testArrayRectangular() {
        int [][] action = array.getNonRectangular();
        assertNotNull(action);
        assertEquals(4, action.length);
        assertEquals(2 , action[0].length);
        assertEquals(4 , action[1].length);
        assertEquals(6, action[2].length);
        assertEquals(8 , action[3].length);

    }
}