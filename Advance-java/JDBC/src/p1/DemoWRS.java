package p1;

import java.io.*;

import javax.sql.rowset.WebRowSet;

import oracle.jdbc.rowset.OracleWebRowSet;

public class DemoWRS 
{

	public static void main(String[] args) 
	{
		try {
			WebRowSet wrs = new OracleWebRowSet();
			wrs.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
			wrs.setUsername("MAHAKAL");
			wrs.setPassword("SHANK");
			wrs.setCommand("SELECT * FROM STUDENT1");
			wrs.execute();
			FileOutputStream fos = new FileOutputStream("student1.xml");
			wrs.writeXml(fos);
		}
		catch(Exception e) {e.printStackTrace();}

	}

}
