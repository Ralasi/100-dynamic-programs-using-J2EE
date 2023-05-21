

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MyFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @param responce 
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain, ServletResponse responce) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		
		 PrintWriter out=responce.getWriter();  
		    out.print("filter is invoked before");  
		          
		    chain.doFilter(request, responce);//sends request to next resource  
		          
		    out.print("filter is invoked after");  
		    }  
//		    public void destroy() {} 

		// pass the request along the filter chain
//		chain.doFilter(request, response);
//	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
