package p1;
import java.util.*;
import java.io.*;
@SuppressWarnings("serial")
public class User extends Object implements Serializable
{   
	public String uname,mid;
	public Date datetime;
      public User(String uname,String mid,Date datetime)
      {
    	  this.uname=uname;
    	  this.mid=mid;
    	  this.datetime=datetime;
      }
      public String toString()
      {
    	  return "Username:"+uname+"\nUsermailid:"+mid+
    			  "\nReg-DateTime:"+datetime;
      }
}
