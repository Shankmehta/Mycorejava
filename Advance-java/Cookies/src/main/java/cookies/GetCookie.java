package cookies;

import jakarta.servlet.*;

import jakarta.servlet.http.*;

import java.io.*;

/**
 * Servlet implementation class GetCookie
 */
public class GetCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        Cookie[] c = request.getCookies();
        PrintWriter pw = response.getWriter();
        pw.println("<htm><body bgcolor=wheat text=blue>");
        pw.println("<h1><u>Selected Books</u></h1>");
        for(Cookie c2:c)
        {
        	pw.println(c2.getValue() + "<br>");
        }
        pw.println("</body></html>");
	}

	
}
