package anotherExperiments.lambda.sameImplementation.goodExample;

public class Test4 {
    static void def(Test5 t) {
        System.out.println(t.abc("hello lambda Expression!"));
    }

    public static void main(String[] args) {
        def(String::length);
    }
}

interface Test5 {
    int abc(String s);
}
