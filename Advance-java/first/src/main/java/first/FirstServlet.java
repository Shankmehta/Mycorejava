 package first;

import jakarta.servlet.*;

import java.io.*;


@SuppressWarnings("serial")
public class FirstServlet extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		pw.println("Welcome to First Servlet");
	}

}
