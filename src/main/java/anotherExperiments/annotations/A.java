package anotherExperiments.annotations;

public class A {
    public void print() {
        System.out.println("A");
    }
}

class C extends B {

    @Override
    public void print() {
        System.out.println("C");
    }
}

class B extends A {

    @Override
    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A a = new C();
        a.print();
    }
}
