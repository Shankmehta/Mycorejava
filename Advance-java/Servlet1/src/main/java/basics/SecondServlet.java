package basics;

import jakarta.servlet.*;

import java.io.*;



@SuppressWarnings("serial")
public class SecondServlet extends GenericServlet
{

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw = response.getWriter();
	    pw.println("<html><body bgcolor=red text=cyan>");
		pw.println("<h1>Hello ,I am Shashank mehta</h1>");
		pw.println("</body></html>");
	}

}
