package quizs.quiz15.overrideOverload;

class Child extends Parent {
     String second() {
        return third();
    }

   static String third() {
        return "Child";
    }
}
