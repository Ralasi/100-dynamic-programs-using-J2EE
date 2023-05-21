package jdbcinsertdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
			Statement st=con.createStatement();
			int res=st.executeUpdate("insert into emp_info values(103,'Ralasi',56000,'BBSR,Rasulgarh,751010')");
			System.out.println(res+"Student record is successfully added.......");
			st.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

}
