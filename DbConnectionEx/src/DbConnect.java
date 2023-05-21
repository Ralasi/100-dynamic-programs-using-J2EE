import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

	public static void main(String[] args)
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002"); 
		System.out.println("db connected");
		con.close();
		}
		catch(Exception e) {
		System.out.println("db is not connected"+e);
		
		}
	}

}
