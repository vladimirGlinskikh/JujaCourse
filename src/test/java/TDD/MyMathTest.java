package TDD;

import org.assertj.core.util.Arrays;
import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MyMathTest {
    int a, b, expResult;

    public MyMathTest(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Rule
    public TestRule timeout = new Timeout(300);

    @Parameterized.Parameters
    public static Collection numbers() {
        return Arrays.asList(new Object[][]{
                {1, 3, 4}, {2, 3, 5}, {2, 4, 6}
        });
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() throws InterruptedException {
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void div() throws InterruptedException {
        int a = 7;
        int b = 0;
        int expResult = 0;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
    }
}