package p1;

import java.sql.*;

public class DemoCallableStatement3 {

	public static void main(String[] args) 
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		CallableStatement cstmt=con.prepareCall("{? = call totalstudents()}");
		cstmt.registerOutParameter(1, Types.INTEGER);
		cstmt.execute();
		int total=cstmt.getInt(1);
		System.out.println(total);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
