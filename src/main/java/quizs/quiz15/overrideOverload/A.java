package quizs.quiz15.overrideOverload;

abstract class A {
    String first() {
        return second();
    }

    abstract String second();

   static String third() {
        return "A";
    }
}
