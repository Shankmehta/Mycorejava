package p1;

public class Task1 
{
     public static void dis1()
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
     }
}
