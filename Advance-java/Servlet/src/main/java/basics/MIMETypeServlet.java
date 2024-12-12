package basics;

import jakarta.servlet.*;

import java.io.*;
public class MIMETypeServlet extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	   response.setContentType("application/msword");
	   PrintWriter pw=response.getWriter();
	   pw.println("Welcome to word");
	}

}
