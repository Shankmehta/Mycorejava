package p1;

public class User1 implements Runnable
{
	public Selection ob=null;
	 public User1(Selection ob)
	 {
		 this.ob=ob;
	 }
     public void run()
     {   
    	 
    	 ob.select(1, "shashank");
    	 
     }
}
