package increaseSalary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class increaseSalaryEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sa=new Scanner(System.in);
			System.out.println("Enter the emp id");
			int id=sa.nextInt();
			System.out.println("Enter Emp increased Salary:");
			int inc=sa.nextInt();
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002"); 
			
			Statement st=con.createStatement();
			
			String sql = "UPDATE Emp_info SET e_salary = e_salary + " + inc + " WHERE e_id = " + id;
			int record=st.executeUpdate(sql);
			if(record>0) {
			System.out.println(record+"Record Updated Successfully....");
			}
			else {
				System.out.println("Employee doesnot exit");
			}
			con.close();
		}
			catch(Exception e) {
			System.out.println(e);
			
			}

	}

}
