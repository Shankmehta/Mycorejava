package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoDelete 
{
	public static void main(String[] args) 
	{  try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs= stmt.executeQuery("SELECT ROLLNO,NAME,MARKS FROM STUDENT1");
		rs.absolute(6);
		rs.deleteRow();
		System.out.println("Deleted successfully");
	}
	catch(Exception e)
	{
		e.setStackTrace(null);
	}
	}
}
