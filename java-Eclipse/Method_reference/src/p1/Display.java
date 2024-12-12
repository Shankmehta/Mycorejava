package p1;

public class Display 
{
      public Display(int x)
       {
    	  System.out.println("****Constructor****"); 
    	  System.out.println("value of x="+x);
       }
      public void m1(int y)
      {
    	  System.out.println("****Instance method****"); 
    	  System.out.println("value of y="+y);
      }
      public static void m2(int z)
      {
    	  System.out.println("****Ststic method****"); 
    	  System.out.println("value of z="+z);
      }
}
