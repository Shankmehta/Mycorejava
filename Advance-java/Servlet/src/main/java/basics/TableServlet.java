package basics;

import jakarta.servlet.*;

import java.io.*;


@SuppressWarnings("serial")
public class TableServlet extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw =response.getWriter();
		pw.println("<html><body bgcolor=pink text=blue><table border=5>");
		for(int i=1;i<=100;i++)
		{
			pw.println("<tr>");
			pw.println("<td>5</td>");
			pw.println("<td>x</td>");
			pw.println("<td>"+i+"</td>");
			pw.println("<td>=</td>");
			pw.println("<td>"+5*i+"</td");
			pw.println("</tr>");
		}
		pw.println("</table></body></html>");
	}

}
