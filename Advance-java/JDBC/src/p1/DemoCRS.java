package p1;

import javax.sql.rowset.CachedRowSet;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class DemoCRS 
{

	public static void main(String[] args) 
	{
		try {
	    CachedRowSet crs = new OracleCachedRowSet();
        crs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        crs.setUsername("MAHAKAL");
        crs.setPassword("SHANK");
        crs.setCommand("SELECT * FROM STUDENT1");
        crs.execute();
        while(crs.next())
        {
        	System.out.print(crs.getInt(1)+"\t");
        	System.out.print(crs.getString(2)+"\t");
        	System.out.print(crs.getInt(3)+"\n");
        }
		}
		catch(Exception e) {e.printStackTrace();}
	}

}
