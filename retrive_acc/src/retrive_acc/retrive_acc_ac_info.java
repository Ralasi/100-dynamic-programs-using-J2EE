package retrive_acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class retrive_acc_ac_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
			
//			String sql = "DELETE FROM users WHERE ac_info = ?";
//          PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE ac_info = ?");	
			PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE ac_info = ?");
            
			while(true) 
			{
			System.out.println("Enter the account number to retrive");
			int acc_info=sc.nextInt();
			
			ps.setInt(1,acc_info);

			
			
            Statement st=con.createStatement();
			
//           ResultSet result = ps.executeQuery();
//            if (!result.next()) {
//                System.out.println("Account number not found.");
//            } else {
//                double balance = result.getDouble("balance");
//                System.out.println("Account number: " + acc_info + ", acbalance: " + balance);
//            }
//
//            result.close();
			
			
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
