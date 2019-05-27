package anotherExperiments.statics;

import static anotherExperiments.statics.A.MAX;
import static anotherExperiments.statics.A.foo;

public class B {
    public static void main(String[] args) {
        System.out.println(MAX);
        foo();
    }
}
