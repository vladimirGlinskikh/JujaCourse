package jspExamples.kz.zhelezyaka.fake;

import jspExamples.kz.zhelezyaka.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage() {
        this.users = new ArrayList<>();
        User user1 = new User("Vladimir", "qwerty01", LocalDate.parse("1975-08-15"));
        User user2 = new User("Andrey", "qwerty034", LocalDate.parse("1972-02-10"));
        User user3 = new User("Alina", "qwerty0347", LocalDate.parse("1990-06-11"));

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public static FakeStorage storage() {
        return storage;
    }

    public List<User> users() {
        return users;
    }
}
