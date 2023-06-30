package update_acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class update_acc_ac_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
			
//			String sql = "DELETE FROM users WHERE ac_info = ?";
//          PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE ac_info = ?");	
			PreparedStatement ps = con.prepareStatement("UPDATE users SET acbalance = ? WHERE ac_info = ?");
            
			while(true) 
			{
			System.out.println("Enter the account number");
			int acc_info=sc.nextInt();
//			System.out.println("Enter your name");
//			String acc_name=sc.nextLine();
			System.out.println("Enter Emp increased Salary:");
			double inc=sc.nextInt();
			
			ps.setInt(1,acc_info);
//			ps.setString(2,acc_name);
			ps.setDouble(2,inc);
			
			
            Statement st=con.createStatement();
			
			String sql = "UPDATE ac_info SET acbalance = acbalance + " + inc + " WHERE acno = " + acc_info;
			int record=st.executeUpdate(sql);
			if(record>0)
			{
			    System.out.println(record+"Record Updated Successfully....");
			}
			else 
			{
				System.out.println("Employee doesnot exit");
			}
			
			
			System.out.println("One record updated successfully");
			System.out.println("Do you want to update more account...(yes/no)");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("no"))break;
			
		}
			ps.close();
			con.close();
			
			}
			catch(Exception e) 
		   {
				System.out.println(e);
		   }

	}

}
