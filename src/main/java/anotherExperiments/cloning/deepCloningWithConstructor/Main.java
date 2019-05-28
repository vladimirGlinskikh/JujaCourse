package anotherExperiments.cloning.deepCloningWithConstructor;

public class Main {
    public static void main(String[] args) {
        Student originalStudent = new Student(35, "Vladimir");
        Student cloneStudent = new Student(originalStudent);

        System.out.println(originalStudent);
        System.out.println(cloneStudent);
    }
}
