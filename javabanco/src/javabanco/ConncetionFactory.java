package javabanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConncetionFactory {
    public static Connection getConnection() throws SQLException {
       return DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
    }
}
