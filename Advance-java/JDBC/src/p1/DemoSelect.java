package p1;
import java.sql.*;
import java.sql.DriverManager;

public class DemoSelect {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
			Statement st = con.createStatement();
		     ResultSet rs=st.executeQuery("SELECT * FROM STUDENT1");
		     ResultSetMetaData rm =rs.getMetaData();
		     int n =rm.getColumnCount();
		     for(int i=1;i<=n;i++)
		     {
		      System.out.print(rm.getColumnName(i)+ " ");  
		     }
		     System.out.println();
		     while(rs.next())
		     {
		    	 System.out.print(rs.getInt(1)+ " \t");
		    	 System.out.print(rs.getString(2)+ "\t ");
		    	 System.out.println(rs.getInt(3));
		     }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
