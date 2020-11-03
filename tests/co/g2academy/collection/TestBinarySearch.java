package co.g2academy.collection;

import org.junit.Test;


import java.util.*;

import static org.junit.Assert.*;

public class TestBinarySearch {
    @Test
    public void testBinarySearch() {
        Integer [] list = {3, 7, 10, 15, 91, 119, 150};
        int target = 91;

        List<Integer> sortedlist = Arrays.asList(list);
        int actual = Collections.binarySearch(sortedlist, target);

        assertEquals(4, actual);

    }

    @Test
    public void testSortedListAndBinarySearch() {
        Integer [] list = {192, 91, 8, 15, 34, 1000, 2};
        int target = 91;
        Arrays.sort(list);
        List<Integer> sortedlist = Arrays.asList(list);
        int actual = Collections.binarySearch(sortedlist, target);

        assertEquals(4, actual);

    }

    @Test
    public void testSortedArrayListAndBinarySearch() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(192); list.add(91); list.add(8); list.add(15);list.add(34);list.add(1000);list.add(2);

        int target = 91;
        Collections.sort(list);

        int actual = Collections.binarySearch(list, target);

        assertEquals(4, actual);

    }

    @Test
    public void testUsingHashSet() {
        //unique
        HashSet<Integer> set = new HashSet<>();
        set.add(192); set.add(91); set.add(8); set.add(15);set.add(34);set.add(1000);set.add(2);
        int target = 91;;
        boolean actual = set.contains(target);
        assertTrue(actual);
    }

    @Test
    public void testUsingTreeSet() {
        //unique
        TreeSet<Integer> set = new TreeSet<>();
        set.add(192); set.add(91); set.add(8); set.add(15);set.add(34);set.add(1000);set.add(2);
        int target = 91;;
        boolean actual = set.contains(target);
        assertTrue(actual);
    }


}
