package co.g2academy.collection;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCollectionTest {

    @Test
    public void testUsingAddAllMethodList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Sonoo");
        secondList.add("Hanumat");

        //expected result
        int actual = list.size();
        assertEquals(5,actual);

    }

    @Test
    public void testUsingRemoveAllMethodList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        //yang aada di second list di remove. dan karena ravi beririsan dengan list pertama maka ikut terhpapus
        list.removeAll(secondList);


        //expected result
        int actual = list.size();
        assertEquals(2,actual);
        assertEquals("Vijay", list.get(0));
        assertEquals("Ajay", list.get(1));
    }

    @Test
    public void testUsingRetainAllMethodList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        ArrayList<String> thirdList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        // yang dipertahankan yang beririsan
        list.retainAll(secondList);

        //expected result
        int actual = list.size();
        assertEquals(1,actual);
        assertEquals("Ravi", list.get(0));

    }
}