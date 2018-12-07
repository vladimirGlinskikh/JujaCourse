package quizs.quiz28.treeMap.question1;

class User implements Comparable<User> {
    public String name;
    public int age;

    public User(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User that) {
        int result = that.age - this.age;
        if (result != 0) {
            return result;
        } else {
            return this.name.compareTo(that.name);
        }
    }
}
