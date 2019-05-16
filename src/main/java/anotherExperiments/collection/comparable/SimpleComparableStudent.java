package anotherExperiments.collection.comparable;

import java.util.Arrays;

public class SimpleComparableStudent implements Comparable {
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    @Override
    public int compareTo(Object o) {
        if (this.group > ((SimpleComparableStudent) o).group) {
            return 1;
        } else if (this.group < ((SimpleComparableStudent) o).group) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Main {
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {
                new SimpleComparableStudent("Vladimir", 124),
                new SimpleComparableStudent("Svetlana", 122),
                new SimpleComparableStudent("Dmitry", 124),
                new SimpleComparableStudent("Sergey", 121),
                new SimpleComparableStudent("Larisa", 125),
        };

        Arrays.sort(myStudents);

        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}
