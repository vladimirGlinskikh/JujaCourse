package anotherExperiments.lambda.sameImplementation.notGood;

import java.util.ArrayList;

public class Test2 {
}

class Student2 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student2(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo2 {
    void printStudent(Student2 st) {
        System.out.println("name students: " + st.name + ", pol: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", medium grade point: " + st.avgGrade);
    }

    void testStudents(ArrayList<Student2> aL, StudentChecks sch) {
        for (Student2 s : aL) {
            if (sch.testStudent(s)) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();

        Student2 st1 = new Student2("Ivan", 'm', 22, 3, 8.3);
        Student2 st2 = new Student2("Petr", 'm', 29, 2, 9.3);
        Student2 st3 = new Student2("Svetlana", 'f', 32, 1, 2.3);
        Student2 st4 = new Student2("Olga", 'f', 42, 4, 5.3);
        Student2 st5 = new Student2("Natasha", 'f', 19, 5, 9.7);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo2 si = new StudentInfo2();
        FindStudentsOverGrade fso = new FindStudentsOverGrade();
        si.testStudents(list, fso);
        System.out.println("----------------");
        FindStudentsUnderGrade fsu = new FindStudentsUnderGrade();
        si.testStudents(list, fsu);

    }
}

interface StudentChecks {
    boolean testStudent(Student2 s);
}

class FindStudentsOverGrade implements StudentChecks {
    @Override
    public boolean testStudent(Student2 s) {
        return s.avgGrade > 8.5;
    }
}

class FindStudentsUnderGrade implements StudentChecks {
    @Override
    public boolean testStudent(Student2 s) {
        return s.avgGrade < 8.5;
    }
}
