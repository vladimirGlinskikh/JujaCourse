package anotherExperiments.constructor;

public class Student extends Person {
    private String name;

    public Student() {
        System.out.println("Student created");
    }

    public Student(int i, String n) {
        super(i);
        this.name = n;
        System.out.println("Student created with name = " + n);
    }
}
