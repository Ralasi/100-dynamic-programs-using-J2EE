

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginservlet
 */
@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginservlet() {
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
		
		String uname=request.getParameter("name");
		String upass=request.getParameter("pass");

		 if (upass.equals("servlet")) 
		 {
		      RequestDispatcher rd=request.getRequestDispatcher("welcome_servlet");
		      rd.forward(request, response);
		 }
		 else 
		 {
		      out.println("Invalid password. Please try again.");
		      RequestDispatcher rd=request.getRequestDispatcher("/index.html");
		      rd.include(request, response);
		 }
		
		out.close();
	}

}
