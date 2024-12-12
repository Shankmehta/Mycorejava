package p1;

import java.sql.*;

public class DemoTM 
{

	public static void main(String[] args)
	{
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		   Statement stmt= con.createStatement();
		   con.setAutoCommit(false);
		   stmt.executeUpdate("INSERT INTO STUDENT1 VALUES(8,'SSS',55)");
		   con.commit();
		   stmt.executeUpdate("INSERT INTO STUDENT1 VALUES(7,'YYY',77)");
		   con.rollback();
		   stmt.executeUpdate("DELETE FROM STUDENT1 WHERE ROLLNO=7");
		   con.commit();
		   System.out.println("Operation successfully");
		   
	   }catch(Exception e) {e.printStackTrace();}

	}

}
