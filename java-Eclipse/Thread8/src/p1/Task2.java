package p1;

public class Task2 
{
    public static void dis2()
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
    }
}
