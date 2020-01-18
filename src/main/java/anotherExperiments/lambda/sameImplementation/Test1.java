package anotherExperiments.lambda.sameImplementation;

import java.util.ArrayList;

public class Test1 {

}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("name students: " + st.name + ", pol: " + st.sex + ", age: " + st.age +
                ", course: " + st.course + ", medium grade point: " + st.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> aL, double avgGrade) {
        for (Student s : aL) {
            if (s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> aL, int age) {
        for (Student s : aL) {
            if (s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student> aL, char sex) {
        for (Student s : aL) {
            if (s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentsMixConditions(ArrayList<Student> aL, double avgGrade, int age, char sex) {
        for (Student s : aL) {
            if (s.avgGrade > avgGrade && s.age < age && s.sex == sex) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Petr", 'm', 29, 2, 9.3);
        Student st3 = new Student("Svetlana", 'f', 32, 1, 2.3);
        Student st4 = new Student("Olga", 'f', 42, 4, 5.3);
        Student st5 = new Student("Natasha", 'f', 19, 5, 9.7);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        StudentInfo si = new StudentInfo();
        si.printStudentsOverGrade(list, 8.5);
        System.out.println("---------------");
        si.printStudentsUnderGrade(list, 9);
        System.out.println("---------------");
        si.printStudentsOverAge(list, 25);
        System.out.println("--------------");
        si.printStudentsBySex(list, 'm');
        System.out.println("--------------");
        si.printStudentsMixConditions(list, 7.0, 32, 'm');
    }
}
