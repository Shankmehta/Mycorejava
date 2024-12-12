package p1;

import java.sql.*;
import java.text.*;
public class DemoPreparedStatement4 {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			PreparedStatement pstmt=con.prepareStatement("INSERT INTO Student2  VALUES(?,?,?)");
			pstmt.setInt(1, Integer.parseInt(args[0]));
			pstmt.setString(2, args[1]);
			
			SimpleDateFormat sdf=new SimpleDateFormat("DD-MM-YYYY");
			java.util.Date d1= sdf.parse(args[2]);
			java.sql.Date d2 = new java.sql.Date(d1.getTime());
			pstmt.setDate(3, d2);
			pstmt.executeUpdate();
			System.out.println("One record Inserted Successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
