package quizs.quiz28.treeMap.question8;

public class User implements Comparable<User> {
    public String name;
    public int age;

    public User(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + name + ", " + age + "}";
    }

    @Override
    public int compareTo(User that) {
        int result = that.name.compareTo(this.name);
        if (result != 0) {
            return result;
        } else {
            return that.age - this.age;
        }
    }
}
