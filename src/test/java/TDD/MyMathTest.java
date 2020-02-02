package TDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class MyMathTest {

    @Rule
    public TestRule timeout = new Timeout(300);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
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