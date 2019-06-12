package anotherExperiments.sql;

import java.sql.*;

public class JavaJDBCExample {

    static final String DB_URL = "jdbc:sqlserver://localhost:1433;database=InternetShopDB";
    static final String USER = "SA";
    static final String PASS = "Zhelezyaka_1975";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT Phone FROM Customers";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String phone = rs.getString("Phone");
                System.out.print("Phone: " + phone + "\n");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Exit connect!");
    }
}
