package kz.zhelezyaka.demoFreeMarker;

public class Person {
    public Person(String firstName, Integer age) {
        this.firstName = firstName;
        this.age = age;
    }

    private String firstName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }
}
