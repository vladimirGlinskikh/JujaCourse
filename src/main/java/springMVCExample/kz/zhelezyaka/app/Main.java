package springMVCExample.kz.zhelezyaka.app;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import springMVCExample.kz.zhelezyaka.dao.UsersDao;
import springMVCExample.kz.zhelezyaka.dao.UsersDaoJdbcTemplateImpl;
import springMVCExample.kz.zhelezyaka.models.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("zh");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);
        List<User> users = usersDao.findAll();
        System.out.println(users);
    }
}
