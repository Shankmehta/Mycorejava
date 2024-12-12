package p1;

public class DemoVariables 
{
     int a=10;
     static int b=20;
     static void m1()
     {
    	 System.out.println("Static method");
    	 System.out.println(b);
     }
	void m2()
	{
		System.out.println("instance method");
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void main(String[] args) 
	{
	    int c =30;
	    
	    DemoVariables.m1();
	    DemoVariables ob = new DemoVariables();
	    ob.m2();
	    System.out.println(c);
	}

}
