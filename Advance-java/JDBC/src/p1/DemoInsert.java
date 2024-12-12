package p1;

import java.sql.*;

public class DemoInsert 
{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			Statement st = con.createStatement();
			st.executeUpdate("INSERT INTO STUDENT1 VALUES(2,'BBB',60)");
	       System.out.println("Table inserted succesfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
