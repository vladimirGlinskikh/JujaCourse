package TDD;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimelineTest {
    private final static int NEW_FETCH_COUNT = new Timeline().getFetchCount();
    private Timeline timeline;

    @Before
    public void setUp() {
        timeline = new Timeline();
    }

    @Test
    public void setFetchCount() {
        timeline.setFetchCount(NEW_FETCH_COUNT);
        assertEquals(NEW_FETCH_COUNT, timeline.getFetchCount());
    }

    @Test
    public void initialState() {
        assertTrue(timeline.getFetchCount() > 0);
    }

    @After
    public void tearDown() {
        timeline.dispose();
    }
}
