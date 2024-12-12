package basics;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.*;
import java.time.LocalTime;



public class TimeServlet extends GenericServlet implements Servlet 
{
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		LocalTime lt = LocalTime.now();
		PrintWriter pw = response.getWriter();
		pw.println("<html><head><meta http-equiv=refresh content=1></head>");
		pw.println("<body bgcolor=blue text=orange><h1>");
		pw.println(lt);
		pw.println("</h1></body></html");
	}

}
