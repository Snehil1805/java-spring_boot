package database_DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection{
    public static final String URL= "jdbc:mysql://localhost:3306/patientRecord";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root"; 
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);

    
    }

}