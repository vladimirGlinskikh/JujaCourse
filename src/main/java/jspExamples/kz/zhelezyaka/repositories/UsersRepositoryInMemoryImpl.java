package jspExamples.kz.zhelezyaka.repositories;

import jspExamples.kz.zhelezyaka.fake.FakeStorage;
import jspExamples.kz.zhelezyaka.models.User;

import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {

    @Override
    public List<User> findAll() {
        return FakeStorage.storage().users();
    }

    @Override
    public void save(User user) {
        FakeStorage.storage().users().add(user);
    }

    @Override
    public boolean isExist(String name, String password) {
        for (User user : FakeStorage.storage().users()) {
            if (user.getName().equals(name) &&
                    user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
