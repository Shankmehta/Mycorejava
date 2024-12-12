package basics;

import jakarta.servlet.*;

import java.io.*;


public class CountServlet extends GenericServlet 
{
  int count=0;

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		count++;
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=brown text=yellow>");
		pw.println("This page is accessed"+count+"times");
		pw.println("</body></html>");
		
	}

}
