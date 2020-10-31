package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayResizingTest {
    @Test
    public void testArrayResizing() {
        ArrayResizing array = new ArrayResizing();
        int [] initialArray = {1,2,3};
        int [] action = array.resize(initialArray , 5);
        assertNotNull(action);
        assertEquals(5 , action.length);
        assertEquals(1 , action[0]);
        assertEquals(2, action[1]);
        assertEquals(3, action[2]);

    }
}