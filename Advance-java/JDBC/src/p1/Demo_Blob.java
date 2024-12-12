package p1;

import java.sql.*;
import java.io.*;

public class Demo_Blob 
{
   public static void main(String[] args)
   {   try
      {
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","MAHAKAL","SHANK");
	   PreparedStatement pstmt = con.prepareStatement("INSERT INTO IMAGES VALUES(?,?)");
	   pstmt.setString(1, args[0]);
	   FileInputStream fis = new FileInputStream(args[1]);
	   pstmt.setBinaryStream(2, fis,fis.available());
	   pstmt.executeUpdate();
	   System.out.println("One image is inserted successfully");
      }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
   }
}
