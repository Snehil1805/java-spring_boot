package JdbcPgm;
import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void () {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String empname = s.nextLine();
        System.out.println("Enter your Department: ");
        String dept = s.nextLine();
        System.out.println("Enter your Salary: ");
        int sal = s.nextInt();
        System.out.println("Enter your EmailID: ");
        String emid = s.nextLine();
        System.out.println("Enter your Phone Number: ");
        Long phoneNo = s.nextInt();

        Employee emp = new Employee(empname,dept,sal,emid,phoneNo);


    }
    void insertData{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpgm_ebl","root","root");
            PreparedStatement ps =  connection.prepareStatement(insert into )
        }
    }

}