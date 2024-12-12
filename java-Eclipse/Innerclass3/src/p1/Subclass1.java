package p1;

public class Subclass1 
{
     
     
     public void m1()
     {
    	 class Subclass2
    	 {
    		 public void m11(int x)
    		 {
    			 System.out.println("subclass2 instance");
    			 System.out.println("value of x="+x);
    			 
    		 }
    	 }
    		 Subclass2 ob = new Subclass2();
    		 ob.m11(10);
     }
    	     public static void m2()
    	 {
    		 class Subclass3
    		 {
    			 public void m22(int y)
    			 {
    				 System.out.println("subclass3 static");
        			 System.out.println("value of y="+y);
    			 }
    		 }
    		 Subclass3 ob1 = new Subclass3();
    		 ob1.m22(20);
    		 
    	 }
     }

