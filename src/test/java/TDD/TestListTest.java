package TDD;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestListTest {
    @Test
    public void testSizeAfterAddOne() {
        List<String> list = new ArrayList<>();
        list.add("B");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }
}