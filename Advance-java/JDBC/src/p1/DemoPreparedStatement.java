package p1;

import java.sql.*;

public class DemoPreparedStatement {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			PreparedStatement pstmt =con.prepareStatement("INSERT INTO STUDENT1 VALUES(?,?,?)");
			pstmt.setInt(1,Integer.parseInt(args[0]));
			pstmt.setString(2,args[1]);
			pstmt.setInt(3,Integer.parseInt(args[2]));
			pstmt.executeUpdate();
			System.out.println("One record inserted successfully");
		}
		catch(Exception  e)
		{
			e.printStackTrace();
		}

	}

}
