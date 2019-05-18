package anotherExperiments.constructor;

public class Employee {
    private int id;
    private String name;

    public Employee() {
        this("Vladimir", 777);
        System.out.println("Default Employee created");
    }

    public Employee(int i) {
        this("Vladimir", i);
        System.out.println("Employee created with default name");
    }

    public Employee(String s, int i) {
        this.id = i;
        this.name = s;
        System.out.println("Employee created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                " Name = " + name;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);
        Employee employee1 = new Employee(17);
        System.out.println(employee1);
        Employee employee2 = new Employee("Glinskikh", 90);
        System.out.println(employee2);
    }
}
