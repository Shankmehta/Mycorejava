package p1;

import java.sql.*;

public class DemoInsertrow {

	public static void main(String[] args) 
	{  try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs= stmt.executeQuery("SELECT ROLLNO,NAME,MARKS FROM STUDENT1");
		rs.moveToInsertRow();
		rs.updateInt(1, 7);
		rs.updateString(2, "GGG");
		rs.updateInt(3, 65);
		rs.insertRow();
		System.out.println("Inserted successfully");
	}
	catch(Exception e)
	{
		e.setStackTrace(null);
	}
	}

}
