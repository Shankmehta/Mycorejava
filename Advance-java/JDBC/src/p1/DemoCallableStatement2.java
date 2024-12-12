package p1;

import java.sql.*;
import java.util.*;

public class DemoCallableStatement2 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			CallableStatement cstmt=con.prepareCall("call getmarks(?,?)");
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the ROllno");
			int rno=s.nextInt();
			cstmt.setInt(1, rno);
			cstmt.registerOutParameter(2,Types.INTEGER);
			cstmt.execute();
			int x=cstmt.getInt(2);
			System.out.println(x);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
