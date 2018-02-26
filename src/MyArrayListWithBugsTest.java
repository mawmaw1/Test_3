import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListWithBugsTest {

    MyArrayListWithBugs tester = new MyArrayListWithBugs();


    @Test
    void add() {
        System.out.println("add method at index 0");
        tester.add(0,new Object());

    }

    @Test
    void remove() {
        System.out.println("Removal test");
        tester.add(new Object());
        tester.remove(0);
        assertEquals(0,tester.size(),"expected 0");
    }


    @Test
    void size() {
        System.out.println("size method");
        tester.add(new Object());
        tester.add(new Object());
        tester.add(new Object());
        tester.add(new Object());
        assertEquals(4, tester.size(), "Should be 4");
    }

    @Test
    void get() {
        System.out.println("index oob test");
        assertThrows(IndexOutOfBoundsException.class, () -> {
            tester.get(4218);
        });

    }



}