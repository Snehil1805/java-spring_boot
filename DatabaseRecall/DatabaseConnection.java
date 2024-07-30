package DatabaseRecall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/healthcare_wecp";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "hellowecp";

    public static Connection getconnection() throws SQLException{

        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
    }
    public static Connection getConnection() {
        return null;
    }


}