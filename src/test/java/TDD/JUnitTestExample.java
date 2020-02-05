package TDD;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JUnitTestExample {
    private List<String> list;

    @Before
    public void setUp() {
        this.list = new ArrayList<>();
    }

    @Test
    public void TestJUnit() {
        list.add("B");
        Assert.assertTrue(list.get(0).equals("B"));
    }
}
