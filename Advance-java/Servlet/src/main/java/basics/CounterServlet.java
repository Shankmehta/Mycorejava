package basics;

import jakarta.servlet.*;

import java.io.*;


public class CounterServlet extends GenericServlet implements Servlet
{
	int count=0;
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		count++;
		PrintWriter pw= response.getWriter();
		pw.println("<html><body bgcolor=red text=purple><h1>");
		pw.println("This page has been accessed"+count+"times");
		pw.println("</h1></body></html>");
	}

}
