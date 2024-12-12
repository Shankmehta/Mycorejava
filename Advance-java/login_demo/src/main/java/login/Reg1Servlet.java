package login;

import jakarta.servlet.*;

import java.sql.*;
import jakarta.servlet.http.*;

import java.io.*;


public class Reg1Servlet extends HttpServlet {
	Connection con;
	public void init(ServletConfig config) throws ServletException
	{
		try
		{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	     con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		}catch(Exception e) {e.printStackTrace();}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
		{
			String s1= request.getParameter("fname");
			String s2= request.getParameter("lname");
			String s3= request.getParameter("uname");
			String s4= request.getParameter("pword");
			
			PreparedStatement pstmt= con.prepareStatement("insert into uinfo values(?,?,?,?)");
			pstmt.setString(1, s1);
			pstmt.setString(2, s2);
			pstmt.setString(3, s3);
			pstmt.setString(4, s4);
			pstmt.executeUpdate();
			
			PrintWriter pw = response.getWriter();
			pw.println("<html><body bgcolor=green text=yellow><center>");
			pw.println("<h1>You Have Registered Successfully</h1>");
			pw.println("<a href=login.html>Login</a>");
			pw.println("</center></body></html>");
		}catch(Exception e) {e.printStackTrace();}
	}
	public void destroy()
	{
		try
		{
			con.close();
		}catch(Exception e) {e.printStackTrace();}
	}

}
