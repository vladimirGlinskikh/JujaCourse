package anotherExperiments.lambda.sameImplementation.goodExample;

import java.util.ArrayList;

public class Test3 {
}

class Student3 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student3(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo3 {
    void printStudent(Student3 st) {
        System.out.println("name students: " + st.name + ", pol: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", medium grade point: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student3> aL, StudentChecks3 sch) {
        for (Student3 s : aL) {
            if (sch.testStudent(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student3> list = new ArrayList<>();

        Student3 st1 = new Student3("Ivan", 'm', 22, 3, 8.3);
        Student3 st2 = new Student3("Petr", 'm', 29, 2, 9.3);
        Student3 st3 = new Student3("Svetlana", 'f', 32, 1, 2.3);
        Student3 st4 = new Student3("Olga", 'f', 42, 4, 5.3);
        Student3 st5 = new Student3("Natasha", 'f', 19, 5, 9.7);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo3 si = new StudentInfo3();

        si.testStudents(list, (Student3 st) -> st.avgGrade > 8.5);
        si.testStudents(list, (Student3 st) -> st.avgGrade < 9);
        si.testStudents(list, (Student3 st) -> st.age > 29);
        si.testStudents(list, (Student3 st) -> st.sex > 'm');
        System.out.println("--------------");
        si.testStudents(list, (Student3 st) -> st.avgGrade > 5.3 && st.sex == 'm' && st.age >= 22);
    }
}

interface StudentChecks3 {
    boolean testStudent(Student3 s);
}

