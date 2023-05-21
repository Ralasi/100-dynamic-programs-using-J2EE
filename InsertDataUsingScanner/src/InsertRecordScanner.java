import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Emp Id:");
			int id=sc.nextInt();
			System.out.println("Enter Emp Name:");
			String name=sc.next();
			System.out.println("Enter Emp Salary:");
			int salary=sc.nextInt();
			System.out.println("Enter Emp Address:");
			String add=sc.next();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002"); 
			
			Statement st=con.createStatement();
			int record=st.executeUpdate("insert into emp_info values("+id+","+name+","+salary+","+add+")");
			System.out.println(record+"Record Added Successfully....");
			}
			catch(Exception e) {
			System.out.println("db is not connected"+e);
			
			}

	}

}
