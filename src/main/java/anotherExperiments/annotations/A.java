package anotherExperiments.annotations;

public class A {
    public static void print() {
        System.out.println("A");
    }
}

class C extends B {
    public static void print(){
        System.out.println("C");
    }
}

class B extends A {
    public static void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        B a = new C();
        a.print();
    }
}
