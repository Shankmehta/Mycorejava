package p1;

import java.sql.*;

public class DemoCOnnection {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			System.out.println("Connection Established Successfully ");
		}
        catch(Exception  e)
		{
        	e.printStackTrace();
		}
	}

}
