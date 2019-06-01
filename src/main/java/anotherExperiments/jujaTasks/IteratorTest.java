package anotherExperiments.jujaTasks;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratorTest {

    public static <T> Stream<T> getStream(Iterator<T> iterator)
    {
        return StreamSupport.stream(Spliterators
                .spliteratorUnknownSize(iterator, 0), false);
    }

    public static <T> Iterator<T> convert(Iterator< Iterator<T> > src)
    {
        return getStream(src).flatMap(x->getStream(x)).iterator();
    }


    public static void main(String[] args) throws Throwable {

        Iterator<Iterator<Integer>> iterator =  Arrays.asList (
                Arrays.asList(4, 2, 0, 4, 6, 4, 9).iterator(),
                Arrays.asList(0, 9, 8, 7, 5).iterator(),
                Arrays.asList(1, 3, 5, 6, 7, 0, 9, 8, 4).iterator()).iterator() ;

        convert(iterator).forEachRemaining(x->System.out.print(x +" "));

    }
}
