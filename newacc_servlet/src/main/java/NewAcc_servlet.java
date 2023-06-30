
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewAcc_servlet
 */
@WebServlet("/NewAcc_servlet")
public class NewAcc_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewAcc_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
			PreparedStatement ps=con.prepareStatement("insert into account_info values(?,?,?,?,?,?)");
			
			int no=Integer.parseInt(request.getParameter("ser"));
			String accnum=request.getParameter("accnum");
			String accname=request.getParameter("name");
			String date=request.getParameter("opdate");
			double acc_balance=Double.parseDouble(request.getParameter("accbal"));
			String acctype=request.getParameter("acctype");
			
			ps.setInt(1,no);
			ps.setString(2,accnum);
			ps.setString(3,accname);
			ps.setString(4,date);
			ps.setDouble(5, acc_balance);
			ps.setString(6, acctype);
			
			ps.executeUpdate();
			con.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		pw.println("<body bgcolor=gold");
		pw.println("<h1 style=color:red;>Account Created Successfully...</h1><br><br>");
		pw.println("<a href=index.html>Do you want to create another account...CLICK HERE</a>");
		pw.println("<body>");
		pw.close();
		
		
		/*<h1>Check your Account details Here...</h1>
	    <form action ="accserv" method="post">
	    <label>Enter Account Number</label>
	    <input type="text" name="acc"><br><br>
	    <label>Enter Account Holder's Name</label>
	    <input type="text" name="acc"><br><br>
	    <label>Enter Account Balance</label>
	    <input type="text" name="acc"><br><br>
	    <label>Enter Account Creation date</label>
	    <input type="text" name="acc"><br><br>
	    <label>Enter Address</label>
	    <input type="text" name="acc"><br><br>
	    <label>Enter Account Type</label>
	    <input type="text" name="acc"><br><br>
	     <input type="submit" value="Create">
	    </form>
	    
	    
		response.setContentType("text/html");
		    PrintWriter pw=response.getWriter();
		    
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
			    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","jasha009@");
			    PreparedStatement ps=con.prepareStatement("Insert into account2 values(?,?,?,?,?,?)");
			    int ano=Integer.parseInt(request.getParameter("acc_no"));
			    String aname=request.getParameter("acch_name");
			    double abal=Double.parseDouble(request.getParameter("acc_bal"));
			    String adate=request.getParameter("acc_date");
			    String acaddress=request.getParameter("acc_address");
			    String atype=request.getParameter("acc_type");
			    ps.setInt(1,ano);
				ps.setString(2,aname);
				ps.setDouble(3,abal);
				ps.setString(4,adate);
				ps.setString(5,acaddress);
				ps.setString(6,atype);
				ps.executeUpdate();
			   
			   
			    con.close();
			  
			
			}
			catch(Exception e)
			{
				pw.println(e);
			}
			  pw.println("<body bgcolor=gray");
			  pw.println("<h1>Account created Successfully...</h1>");
			  pw.println("<a href=index.html>Click Here to create Another Account</a>");
			  pw.close();	*/	
		}

		}
	}

}
