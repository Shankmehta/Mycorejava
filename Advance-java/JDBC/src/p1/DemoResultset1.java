package p1;

import java.sql.*;

public class DemoResultset1 
{

	public static void main(String[] args) 
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmt.executeQuery("Select * from Student1");
		rs.absolute(3);
		System.out.print(rs.getInt("rollno")+"\t");
		System.out.print(rs.getString("name")+"\t");
		System.out.print(rs.getInt("marks"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
