package p1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Scanner;

public class Create {

	public static void main(String[] args) 
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			CallableStatement cstmt=con.prepareCall("{?=call totalstudent1()}");
			cstmt.registerOutParameter(1,Types.INTEGER);
		     cstmt.execute();
		     int x =cstmt.getInt(1);
		     System.out.println(x);
		} catch (Exception e) {
		
			e.printStackTrace();
		}

	}

}