package sample;

import jakarta.servlet.*;

import java.io.*;
import jakarta.servlet.annotation.*;

@WebServlet("/test")
public class TestServlet extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("Welcome to naresh it");
	}

}
