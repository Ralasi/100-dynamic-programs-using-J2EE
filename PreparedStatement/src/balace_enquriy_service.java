

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class balace_enquriy_service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
			
			PreparedStatement ps = con.prepareStatement("select acbalance from ac_info where acno=? ");
			
			while(true)
			{
				System.out.println("Enter your account number");
				int acc_no=sc.nextInt();
				
				ps.setInt(1,acc_no);
				
				ResultSet res=ps.executeQuery();
				if(res.next())
				{
					System.out.println("Account balance is:"+res.getFloat(1));
				}
				else
				{
					System.out.println("Account does not exist");
					res.close();
				}
				
				System.out.println("Do you want to continue with depositing with another amount(yes/no)");
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

