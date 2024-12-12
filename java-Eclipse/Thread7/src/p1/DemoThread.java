package p1;

public class DemoThread
{

	public static void main(String[] args)
	{
		new Thread(()->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Task-1");
				try
				{
					Thread.sleep(2000);
					
				}
				catch(Exception e) {e.printStackTrace();}
			}
		}).start();
		new Thread(()->
		{
            for(int i=1;i<=5;i++)
            {
            	System.out.println("Task-2");
            	try
            	{
            		Thread.sleep(2000);
            		
            	}
            	catch(Exception e) {e.printStackTrace();}
            }
		}).start();
	}
}
