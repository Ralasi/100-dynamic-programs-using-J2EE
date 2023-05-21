

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Balace_servlet
 */
@WebServlet("/Balace_servlet")
public class Balace_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Balace_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","Safi@2002");
		//Statement stmt = con.prepareStatement("select acbalace from ac_info where");
		Statement st=con.createStatement();
		String sqlquery="select acbalance from ac_info where acno="+request.getParameter("acc");
		ResultSet rs=st.executeQuery(sqlquery);
		
		if(rs.next())
		{
			out.println("<h1 style=color:red>Account balance: "+rs.getDouble(1)+"</h1>");
		}
		else
		{
			out.println("<h1>Account number does not exit...</h1>");
		}
		rs.close();
		con.close();
		out.close();
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
