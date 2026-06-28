package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static Connection connect() throws SQLException{
        String db_url =System.getenv("DB_URL");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        Connection connection = DriverManager.getConnection(db_url,username,password);

        return connection;
    }
}
