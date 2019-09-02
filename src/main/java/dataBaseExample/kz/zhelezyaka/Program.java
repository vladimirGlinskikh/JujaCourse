package dataBaseExample.kz.zhelezyaka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        String dbUser = "postgres";
        String dbPassword = "zh";
        String connectionUrl = "jdbc:postgresql://localhost:5432/fix_users";

        try {
            Connection connection = DriverManager.getConnection(connectionUrl, dbUser, dbPassword);
        } catch (SQLException e) {
            System.err.println("connection is wrong!");
        }
        System.out.println("connection established!");
    }
}
