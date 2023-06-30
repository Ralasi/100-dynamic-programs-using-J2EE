

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class targetservlet
 */
@WebServlet("/targetservlet")
public class targetservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public targetservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String pno=request.getParameter("polnum");
		ServletContext sc1=getServletContext();
		sc1.setAttribute("np", pno);
		pw.println("<h1>"+sc1.getInitParameter("ralasi@lic.com")+"</h1>");
        pw.println("<h1>Your policy number is:"+pno+"</h1>");
		pw.close();
	}

}
