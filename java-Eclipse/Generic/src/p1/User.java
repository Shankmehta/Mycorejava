package p1;

public class User 
{
   public String uname,mid;
   public User(String uname,String mid)
   {
	   this.uname=uname;
	   this.mid=mid;  
   }
   public String toString()
   {
	   return uname+" "+mid;
   }
}
