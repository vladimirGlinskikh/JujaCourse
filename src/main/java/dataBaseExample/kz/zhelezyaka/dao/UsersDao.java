package dataBaseExample.kz.zhelezyaka.dao;

import dataBaseExample.kz.zhelezyaka.models.User;

import java.util.List;

public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
}
