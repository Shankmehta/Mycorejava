package sample;

import jakarta.servlet.*;

import java.io.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/test")
public class TestServlet extends GenericServlet implements Servlet  {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw = response.getWriter();
		pw.println("Welcome to naresh it");
	}

}
