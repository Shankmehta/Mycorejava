package basics;

import jakarta.servlet.*;

import java.io.*;


public class MimetypeServlet extends GenericServlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/msword");
		PrintWriter pw=response.getWriter();
		pw.println("Welcome to word");
	}

}
