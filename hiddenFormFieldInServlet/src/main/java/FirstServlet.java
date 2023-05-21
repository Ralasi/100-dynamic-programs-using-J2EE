

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try{  
			  
	        response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n=request.getParameter("uname");  
	        out.print("Welcome "+n);  
	          
	        //creating form that have invisible textfield  
	        out.print("<form action='SecondServlet'>");  
	        out.print("<input type='hidden' name='uname' value='"+n+"'>");  
	        out.print("<input type='submit' value='go'>");  
	        out.print("</form>");  
	        out.close();  
	  
	                }
		   catch(Exception e){
			   System.out.println(e);
			   }  
		
	}

}
