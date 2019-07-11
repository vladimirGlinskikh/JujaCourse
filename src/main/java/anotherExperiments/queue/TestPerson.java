package anotherExperiments.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);
        Person person5 = new Person(5);

        Queue<Person> people = new ArrayBlockingQueue<>(10);
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);
        people.add(person5);

        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);
    }
}
