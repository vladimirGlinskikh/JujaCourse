package quizs.quiz15.overrideOverload;

abstract class Parent {
    String first() {
        return second();
    }

    abstract String second();

   static String third() {
        return "Parent";
    }
}

