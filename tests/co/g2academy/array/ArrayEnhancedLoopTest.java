package co.g2academy.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayEnhancedLoopTest {
        ArrayEnhancedLoop array = new ArrayEnhancedLoop();

    @Test
    public void testSumAllItemInArrayOfInteger() {
        int action = array.calculateSumAllItem();
        assertEquals(30 , action);
    }

    @Test
    public void testMultiplicationAllItemOfInteger() {
        int action = array.calculationMultiplicationAllItem();
        assertEquals(2400 , action);
    }

    @Test
    public void testAverageAllItemOfInteger() {
        int action = array.averageAllItemOfInteger();
        assertEquals(6 , action);
    }
}