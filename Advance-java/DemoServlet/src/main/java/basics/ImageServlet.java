package basics;

import jakarta.servlet.*;

import java.io.*;


public class ImageServlet extends GenericServlet implements Servlet {
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
	    ServletOutputStream sos = response.getOutputStream();
	    FileInputStream fis = new FileInputStream("E:/Photoshoot/IMG_20190930_122012.jpg");
	    int n = fis.available();
	    byte b[]= new byte[n];
	    fis.read(b);
	    sos.write(b);
	}

}
