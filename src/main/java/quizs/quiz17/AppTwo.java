package quizs.quiz17;

class AppTwo {
    static int k;

    static class X {
       static int p;

       static class Y {
            public void f() {
                System.out.println(k);
                System.out.println(p);
            }
        }
    }
}
