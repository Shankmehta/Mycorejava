package p1;
import java.sql.*;


public class CreateDemo {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			Statement st =con.createStatement();
			st.execute("CREATE TABLE STUDENT1(ROLLNO NUMBER(3),NAME VARCHAR2(10),MARKS NUMBER(3))");
			System.out.println("TABLE CREATEDE Successfullly ");
		}
		catch(Exception  e)
		{
			e.printStackTrace();
		}
		

	}

}
