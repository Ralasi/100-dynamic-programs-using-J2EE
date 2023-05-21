import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class deposite_service_ac_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
			
			PreparedStatement ps = con.prepareStatement("update ac_info set acbalance=acbalance+? where acno=?");
			
			while(true)
			{
				System.out.println("Enter your account number");
				int acc_no=sc.nextInt();
				System.out.println("Enter deposite amount Rs.:");
				double dep_amt=sc.nextDouble();
				
				ps.setInt(2, acc_no);
				ps.setDouble(1, dep_amt);
				
				int res=ps.executeUpdate();
				if(res>0)
				{
					System.out.println("Amount deposite success");
				}
				else
				{
					System.out.println("Cannt deposite...Enter correct account no.");
					
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
