package p1;

import java.sql.*;
import java.util.*;
public class DemoPreparedStatement2 
{

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		PreparedStatement pstmt =con.prepareStatement("SELECT * FROM STUDENT1 WHERE ROLLNO=?");
		Scanner s = new Scanner(System.in);
		System.out.println("ENter the rollno");
		int rollno=s.nextInt();
		pstmt.setInt(1, rollno);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		System.out.print(rs.getInt(1) + "\t");
		System.out.print(rs.getString(2) +"\t");
		System.out.print(rs.getInt(3));
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
