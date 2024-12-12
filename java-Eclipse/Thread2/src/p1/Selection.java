package p1;

public class Selection 
{
   public void select(int n,String name)
   {
	   if(n<=Available.av)
	   {
		   System.out.println(n+"Ticket booked for"+name);
	   
	   Available.av=Available.av-n;
	   }
	   else 
	   {
		   System.out.println("No tickets avilable for "+name);
	   }
   }
}
