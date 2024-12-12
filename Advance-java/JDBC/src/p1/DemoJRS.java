package p1;

import javax.sql.rowset.JdbcRowSet;

import oracle.jdbc.rowset.OracleJDBCRowSet;

public class DemoJRS 
{

	public static void main(String[] args) 
	{   
		try
		{
			JdbcRowSet jrs= new OracleJDBCRowSet();
		jrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		jrs.setUsername("MAHAKAL");
		jrs.setPassword("SHANK");
		jrs.setCommand("SELECT * FROM STUDENT1");
		jrs.execute();
		  while(jrs.next())
		  {
			  System.out.print(jrs.getInt(1)+"\t");
			  System.out.print(jrs.getString(2)+"\t");
			  System.out.print(jrs.getInt(3)+"\n");
		  }
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
