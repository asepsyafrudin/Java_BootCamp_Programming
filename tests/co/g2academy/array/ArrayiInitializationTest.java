package co.g2academy.array;

import co.g2academy.basic.MyDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayiInitializationTest {

    ArrayiInitialization arrayinitialization = new ArrayiInitialization();
    @Test
    public void testgetNameArrayInitialization() {
        String[] action = arrayinitialization.getName();
        assertNotNull(action);
        assertEquals("Georgiana" , action[0]);
        assertEquals(3 ,  action.length);
    }

    @Test
    public void testSimpleNameInitilization() {
        String [] action = arrayinitialization.getSimpleName();
        assertNotNull(action);
        assertEquals("Georgiana" , action[0]);
        assertEquals(3 ,  action.length);
    }

    @Test
    public void getMyDate() {
        MyDate[] action = arrayinitialization.getMyDate();
        assertNotNull(action);
        assertEquals(3, action.length);
    }

    @Test
    public void getSimpleMyDate() {
        MyDate[] action = arrayinitialization.getSimpleMyDate();
        assertNotNull(action);
        assertEquals(3, action.length);
    }
}