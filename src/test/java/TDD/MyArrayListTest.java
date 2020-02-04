package TDD;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void testEmptySize() {
        if (new MyArrayList<String>().size() != 0) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyOne() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Q");
        if (list.size() != 0) {
            throw new AssertionError();
        }
    }
}
