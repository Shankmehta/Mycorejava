package p1;

public class DemoThread 
{

	public static void main(String[] args) 
	{
		Runnable ob1 = new Runnable()
				{
			       public void run()
			       {
			    	 for(int i=1;i<=5;i++)
			    	 {
			    		 if(i==4)
			    		 {
			    			 Thread.currentThread().stop();
			    		 }
			    		 System.out.println("Task-1");
			    		 try
			    		 {
			    			 Thread.sleep(2000);
			    		 }
			    		 catch(Exception e)
			    		 {
			    			 e.printStackTrace();
			    		 }
			    	 }
			       }
				};
				
				Runnable ob2 = new Runnable()
						{
					        public void run()
					        {
					        	for(int i=1;i<=5;i++)
					        	{
					        		
					        		System.out.println("Task-2");
					        		try
					        		{
					        			Thread.sleep(2000);
					        		}
					        		catch(Exception e)
					        		{
					        			e.printStackTrace();
					        		}
					        	}
					        }
						};
						Thread t1 =new Thread(ob1);
						Thread t2 = new Thread(ob2);
						t1.start();
						try
						{
							t1.join();
						}catch(Exception e) {e.printStackTrace();}
						t2.start();

	}

}
