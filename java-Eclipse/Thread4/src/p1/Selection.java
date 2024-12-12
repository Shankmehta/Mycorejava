package p1;

public class Selection 
{
    public synchronized static void select(int n,String name)
    {
    	if(n<=Available.av)
    	{
    		System.out.println(n+" Ticked is booked for="+name);
    		Available.av=Available.av-n;
    	}
    	else 
    	{
    		System.out.println("No Ticket available for="+name);
    	}
    }
}
