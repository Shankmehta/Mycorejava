package basics;

import jakarta.servlet.*;

import java.io.*;

public class FirstServlet extends GenericServlet implements Servlet
{
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw= response.getWriter();
		pw.println("<html><body bgcolor=yellow text=red>");
		pw.println("<h1>Welcome to AdvJava</h1>");
		pw.println("</html></body>");
	}

}
