package p1;

public class User2 implements Runnable
{
	public Selection ob=null;
	public User2(Selection ob)
	{
		this.ob=ob;
	}
    public void run()
     {  
    	
	    ob.select(1,"nayan");
    	
     }
}
