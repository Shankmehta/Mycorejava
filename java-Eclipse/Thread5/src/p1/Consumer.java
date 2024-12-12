package p1;

public class Consumer implements Runnable
{
    public Producer prod= null;
    public Consumer(Producer prod)
    {
    	this.prod=prod;
    }
    public void run()
    {
    	try
    	{
    		synchronized(prod.sb)
    		{
    			System.out.println("Consumer Started ....but Blocked");
    			prod.sb.wait();
    			System.out.println("====Display Using Consumer====");
    			System.out.println(prod.sb.toString());
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
