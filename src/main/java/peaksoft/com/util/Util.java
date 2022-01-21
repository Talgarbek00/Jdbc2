package peaksoft.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final   static String user = "postgres";
    private final static String password = "root";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to the PostgreSQL server\n" +
//                    "successfully.");
            System.out.println("===================================");
        } catch (SQLException e) {
            e.getMessage();
        }
        return connection;
    }
}
