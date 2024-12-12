package p1;

import java.sql.*;

public class BatchUpdates {

	public static void main(String[] args) 
	{
		 try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
				Statement stmt=con.createStatement();
				stmt.addBatch("INSERT INTO STUDENT1 VALUES(6,'FFF',55)");
				stmt.addBatch("UPDATE STUDENT1 SET MARKS=95 WHERE ROLLNO=4");
				stmt.addBatch("DELETE FROM STUDENT1 WHERE ROLLNO=7");
				stmt.executeBatch();
			}
			catch(Exception e)
			{
				e.setStackTrace(null);
			}

	}

}
