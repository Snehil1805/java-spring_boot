package JDBCMovies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class CRUDOperationJDBC {
	MoviesBean mb = new MoviesBean();
	Scanner scan=new Scanner(System.in);
	public static final String DRIVERNAME="com.mysql.cj.jdbc.Driver";
	public static final String URL="jdbc:mysql://localhost:3306/jdbcpgm_ebl";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";

    void getData(){
        System.out.println("Enter movie ID: ");
        mb.setMovieId(scan.nextInt());
        System.out.println("Enter movie name: ");
        mb.setMovieName(scan.next()); 
        System.out.println("Enter the year in which movie is released: ");
        mb.setMovieReleasedYear(scan.nextInt());
    }
    void insertData(){
        try{

            Class.forName(DRIVERNAME);
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            PreparedStatement ps = connection.prepareStatement("insert into Movies (movieId , movieName , movieReleasedYear) values(?,?,?)");
            ps.setFloat(1, mb.getMovieId());
            ps.setString(2, mb.getMovieName());
            ps.setLong(3, mb.getMovieReleasedYear());
            int res=ps.executeUpdate();
            if(res>0){
                System.out.println("Insert Successfully");
            }else{
                System.out.println("Error in Insertion");
            }
        }
		catch  (ClassNotFoundException cnfe)
		{
			System.out.println(cnfe);
		}
		catch (SQLException sqle)
		{
			System.out.println(sqle);
		}
	}
 



}