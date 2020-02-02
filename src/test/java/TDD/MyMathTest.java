package TDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(timeout = 300)
    public void add() throws InterruptedException {
        int a = 2;
        int b = 7;
        int expResult = 9;
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
    }

    @Test
    public void div() {
    }
}