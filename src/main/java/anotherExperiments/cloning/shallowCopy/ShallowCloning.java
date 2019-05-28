package anotherExperiments.cloning.shallowCopy;

public class ShallowCloning {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student("Vladimir", 30, group);

        try {
            Student cloneStudent = (Student) student.clone();
            System.out.println(student);
            System.out.println(cloneStudent);

            cloneStudent.name = "Alexander";
            cloneStudent.group.id = 10;
            cloneStudent.age = 35;

            System.out.println("After cloning---------- ");

            System.out.println(student);
            System.out.println(cloneStudent);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
