package first;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;



public class FirstServlet extends GenericServlet  {
	

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw = response.getWriter();
		pw.println("<html><body bgcolor=blue text=red><h1>");
		pw.println("Welcome Shashank"); 
		pw.println("</h1></body></html>");
	}

}
