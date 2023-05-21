

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class emp_details_servlet
 */
@WebServlet("/emp_details_servlet")
public class emp_details_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public emp_details_servlet() {
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
		String name=request.getParameter("name");
		String emp=request.getParameter("eid");
		String salary=request.getParameter("sal");
		int id=Integer.parseInt(emp);
		int sal=Integer.parseInt(salary);
//		String b=request.getParameter("no2");
//		int n1=Integer.parseInt(a);
//		int n2=Integer.parseInt(b);	
//		int s=n1+n2;
		float ta=sal*7/100;
		float da=sal*12/100;
		float hra=sal*9/100;
		double gross=sal+ta+da+hra;
		double deduct=gross*17/100;
		double net=gross-deduct;
		out.println("<h1 style=color:black;>"+"Welcome To:"+name+"</h1>");
		out.println("<h1 style=color:red;>"+"Basic Sal is :"+sal+"</h1>");
		out.println("<h1 style=color:blue;>"+"Ta is :"+ta+"</h1>");
		out.println("<h1 style=color:blue;>"+"Da is :"+da+"</h1>");
		out.println("<h1 style=color:blue;>"+"Hra is :"+hra+"</h1>");
		out.println("<h1 style=color:blue;>"+"Gross is :"+gross+"</h1>");
		out.println("<h1 style=color:yellow;>"+"Deduct is :"+deduct+"</h1>");
		out.println("<h1 style=color:green;>"+"Net Salary is :"+net+"</h1>");
		out.close();
	}

}
