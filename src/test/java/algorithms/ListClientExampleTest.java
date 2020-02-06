package algorithms;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class ListClientExampleTest {
    @Test
    public void testListClientExample() {
        ListClientExample listClientExample = new ListClientExample();
        List<String> list = listClientExample.getList();
        assertThat(list, instanceOf(LinkedList.class));
    }
}