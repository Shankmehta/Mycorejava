package p1;

public class Subclass1
{
	public int a=10;
    public static int b=20;
    
    public void m1()
    {
 	   System.out.println("****Outer class****");
 	   System.out.println("Value of a="+a);
 	   System.out.println("Value of b="+b);
    }
    public static class Subclass2
    {
    	public int x=100;
        public static int y=200;
        
        public void m2()
        {
        	 System.out.println("*** innerclass instance****");
       	   System.out.println("Value of x="+x);
       	   System.out.println("Value of y="+y);
       	System.out.println("Value of b="+b);
        }
        public static void m22()
        {
        	 System.out.println("*** innerclass static****");
       	   System.out.println("Value of y="+y);
       	System.out.println("Value of b="+b);
        }
    }
}
