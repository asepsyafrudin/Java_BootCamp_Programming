package co.g2academy.array;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ArrayOfPointTest {

    @Test
    public void createOfArray() {
        ArrayOfPoint createOfPoint = new ArrayOfPoint();
        Point[] action = createOfPoint.createOfArray();
        assertNotNull(action);
        assertEquals( 0, action[0].x);
        assertEquals(9 , action[9].x);
        assertEquals(10, action[9].y);
        assertEquals(10 , action.length);
    }
}