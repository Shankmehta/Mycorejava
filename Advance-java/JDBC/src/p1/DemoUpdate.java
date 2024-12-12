package p1;

import java.sql.*;

public class DemoUpdate {

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("SELECT ROLLNO,NAME,MARKS FROM STUDENT1");
		rs.absolute(5);
		rs.updateInt(3, 40);
		rs.updateRow();
		System.out.println("Updated successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
