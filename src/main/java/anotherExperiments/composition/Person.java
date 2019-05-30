package anotherExperiments.composition;

public class Person {
    private Job job; // composition has-a relationship

    public Person() {
        this.job = new Job();
        job.setSalary(2000L);
    }

    public long getSalary() {
        return job.getSalary();
    }
}
