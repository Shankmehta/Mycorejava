package p2;
import p1.*;
public class DemoInnerclass 
{

	public static void main(String[] args)
	{
	    System.out.println("Anonymous as class extension");
	    Pclass ob1 =new Pclass()
	    {
	    	public void m1(int x)
	        {
	        	System.out.println("value of x="+x);
	        }
	    };
	    ob1.m1(10);
	    ob1.m2(20);
         
	    
	    System.out.println("Anonymous as Implementation class");
	    Itest ob2= new Itest()
	     {
	    	  public void m1(int a)
	    	  {
	    		  System.out.println("value of a="+a);
	    	  }
	     };
	    ob2.m1(100);
	    ob2.m2(200);
	}

}
