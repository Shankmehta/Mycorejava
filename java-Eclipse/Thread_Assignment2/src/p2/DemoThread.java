package p2;

import java.util.Date;
import p1.Login;

import p1.Register;

public class DemoThread {

	public static void main(String[] args) 
	{
		 System.out.println("lambda Expression");
			Itest ob1 = (String s) ->
				
				 {
					 for(int i=1;i<=5;i++)
					   {
						   System.out.println("Reg..Process..by Alex.."+new Date());
						  try { 
						   Thread.sleep(2000);
						  }
						  catch(InterruptedException ie)

					   {
							  ie.printStackTrace();}
					   }
				    	
				 	
				 
			    };
			 System.out.println("Anonymous as class extension");
			Login ob2 = new Login()
			{
				public void run()
				{
				 for(int i=1;i<=5;i++)
			    	{
			    		System.out.println("Log..Process..by Ram.."+new Date());
			    	try {	
			    	   Thread.sleep(2000);
			    	     }
			    	  catch(InterruptedException ie)
			    	     {
			    		  ie.printStackTrace();
			    	      }
			        }
				}
			};
			Thread t1= new Thread(ob1);
			Thread t2 = new Thread(ob2);
			t1.start();
			t2.start();


	}

}
