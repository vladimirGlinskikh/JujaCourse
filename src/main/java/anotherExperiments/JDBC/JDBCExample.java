package anotherExperiments.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/devstudy"
                , "postgres", "zh")) {
            System.out.println("Connecting to database...");

            Statement statement = connection.createStatement();
            System.out.println("Creating statement...");
            String sql = "SELECT id, created FROM contact";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String created = resultSet.getString("created");
                System.out.print("ID: " + id + "\n");
                System.out.print("Created: " + created + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
