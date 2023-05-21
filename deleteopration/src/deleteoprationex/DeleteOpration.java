package deleteoprationex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteOpration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Emp Id:");
			int id=sc.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
			
			Statement st=con.createStatement();
			int record=st.executeUpdate("Delete from emp_info where e_id="+id);
			if(record>0) {
			System.out.println(record+"Record Deleted Successfully....");
			}
			else {
				System.out.println("Employee doesnot exit");
			}
		}
			catch(Exception e) {
			System.out.println(e);
			
			}

	}

}
