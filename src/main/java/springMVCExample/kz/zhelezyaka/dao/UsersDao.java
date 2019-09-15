package springMVCExample.kz.zhelezyaka.dao;

import springMVCExample.kz.zhelezyaka.models.User;

import java.util.List;

public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
}
