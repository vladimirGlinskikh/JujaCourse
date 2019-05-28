package anotherExperiments.cloning.exampleOne;

public class ShallowCloning {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student("Vladimir", 30, group);

        try {
            Student cloneStudent = (Student) student.clone();
            System.out.println(student);
            System.out.println(cloneStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
