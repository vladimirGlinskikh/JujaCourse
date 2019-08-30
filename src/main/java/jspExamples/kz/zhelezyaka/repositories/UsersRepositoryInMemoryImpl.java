package jspExamples.kz.zhelezyaka.repositories;

import jspExamples.kz.zhelezyaka.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {
    private List<User> users;

    public UsersRepositoryInMemoryImpl() {
        this.users = new ArrayList<>();
        User user1 = new User("Vladimir", "qwerty01", LocalDate.parse("1975-08-15"));
        User user2 = new User("Andrey", "qwerty034", LocalDate.parse("1972-02-10"));
        User user3 = new User("Alina", "qwerty0347", LocalDate.parse("1990-06-11"));

        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    @Override
    public List<User> findAll() {
        return this.users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}
