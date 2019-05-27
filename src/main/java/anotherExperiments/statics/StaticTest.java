package anotherExperiments.statics;

public class StaticTest {
    public static void main(String[] args) {
        StaticExample.setCount(5);
        StaticExample.string = "abc";

        StaticExample staticExample = new StaticExample();
        System.out.println(staticExample.getCount());

        System.out.println(StaticExample.string + " is same as " + staticExample.string);
        System.out.println(StaticExample.string == staticExample.string);

        StaticExample.MyStaticClass myStaticClass = new StaticExample.MyStaticClass();
        myStaticClass.count = 10;

        StaticExample.MyStaticClass myStaticClass1 = new StaticExample.MyStaticClass();
        myStaticClass1.count = 20;

        System.out.println(myStaticClass.count);
        System.out.println(myStaticClass1.count);
    }
}
