package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Db_trial {
    public static void main(String[] args) {
        String db_url =System.getenv("DB_URL");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        try{
            Connection conn = DriverManager.getConnection(
                    db_url,
                    username,
                    password
            );

            System.out.println("Database connected successfully");
            conn.close();

        }catch (Exception e){
            System.out.println("Connection failed");
            System.out.println(e.getMessage());
        }
    }
}
