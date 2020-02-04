package TDD;

import org.junit.Test;

import java.util.ArrayList;

public class MyArrayListTest {
    @Test
    public void testEmptySize() {
        if (new ArrayList<String>().size() != 0) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyOne() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Q");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }
}
