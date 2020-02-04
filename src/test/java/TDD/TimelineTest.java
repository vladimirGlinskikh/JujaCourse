package TDD;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimelineTest {
    private final static int NEW_FETCH_COUNT = Timeline.DEFAULT_FETCH_COUNT + 1;

    @Test
    public void setFetchCount() {
        Timeline timeline = new Timeline();

        timeline.setFetchCount(NEW_FETCH_COUNT);
        assertEquals(NEW_FETCH_COUNT, timeline.getFetchCount());
    }
}
