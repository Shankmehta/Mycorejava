package cookies;

import jakarta.servlet.*;

import jakarta.servlet.http.*;

import java.io.*;


public class SetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SetCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String s1= request.getParameter("book1");
		String s2= request.getParameter("book2");
		String s3 = request.getParameter("book3");
		
		PrintWriter pw = response.getWriter();
		if(s1!=null)
		{
			Cookie c1 = new Cookie("book1",s1);
			response.addCookie(c1);
		}
		if(s2!=null)
		{
			Cookie c2 = new Cookie("book2",s2);
			response.addCookie(c2);
		}
		if(s3!=null)
		{
			Cookie c3 = new Cookie("book2",s3);
			response.addCookie(c3);
		}
		pw.println("<html><body bgcolor=cyan text=red><center");
		pw.println("<h1>Your Books are Added to cart</h1>");
		pw.println("<a href=Get>Next</a>");
		pw.println("</center></body></html>");
	}

}
