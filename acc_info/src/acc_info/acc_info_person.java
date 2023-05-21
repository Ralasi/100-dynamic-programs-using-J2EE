package acc_info;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class acc_info_person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
			
			PreparedStatement ps=con.prepareStatement("insert into ac_info values(?,?,?)");
			
			while(true) 
			{
			System.out.println("Enter the account number");
			int acc_info=sc.nextInt();
			System.out.println("Enter the account name");
			String acc_name=sc.next();
			System.out.println("Enter the account balance");
			double acc_bal=sc.nextDouble();
			
			ps.setInt(1,acc_info);
			ps.setString(2,acc_name);
			ps.setDouble(3,acc_bal );
			
			ps.executeUpdate();
			System.out.println("One record stored successfully");
			System.out.println("Do you want to create more account...(yes/no)");
			String choice=sc.next();
			if(choice.equalsIgnoreCase("no"))break;
		}
			ps.close();
			con.close();
			
			}
			catch(Exception e) {
				System.out.println(e);
			
			
			}

	}

}
