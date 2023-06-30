

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextServlet1
 */
@WebServlet("/ContextServlet1")
public class ContextServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try{  
			  
			response.setContentType("text/html");  
			PrintWriter out=response.getWriter();  
			  
			ServletContext context=getServletContext();  
			context.setAttribute("company","IBM");  
			  
			out.println("Welcome to first servlet");  
			out.println("<a href='ContextServlet2'>visit</a>");  
			out.close(); 
			  
			}catch(Exception e)
				{
				e.printStackTrace();
				}
	}

}
