package p1;

import java.sql.*;

public class DemoPreparedStatement3 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			PreparedStatement pstmt=con.prepareStatement("INSERT INTO Student2  VALUES(?,?,?)");
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			pstmt.setDate(3, Date.valueOf(args[2]));
			pstmt.executeUpdate();
			System.out.println("One record Inserted Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
