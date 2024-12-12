package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class DemoTm2 {

	public static void main(String[] args) 
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
		   Statement stmt= con.createStatement();
		   con.setAutoCommit(false);
		   stmt.executeUpdate("INSERT INTO STUDENT1 VALUES(5,'ZZZ',87)");
		   con.commit();
		   Savepoint sp = con.setSavepoint();
		   stmt.executeUpdate("INSERT INTO STUDENT1 VALUES(9,'yyy',67)");
		   con.rollback(sp);
		   stmt.executeUpdate("DELETE FROM STUDENT1 WHERE  ROLLNO =6");
		   con.commit();
		   System.out.println("Operation suceesfull");
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
