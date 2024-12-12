package p1;

public class PDisplay 
{
    private int x=10;
    private static int y=20;
    private PDisplay() {}
    private void dis1()
    {
    	System.out.println("---Dis1---");
    	System.out.println("The value of x:"+x);
    	System.out.println("The value of y:"+y);
    }
    private static void dis2()
    {
    	System.out.println("---Dis2---");
    	System.out.println("The value of y:"+y);
    }
    private class SubClass2
    {
    	public void m2()
    	{
    		System.out.println("---INnerclass2 m2()---");
        	System.out.println("The value of x:"+x);
        	System.out.println("The value of y:"+y);
    	}
    }
    	private static class SubClass22
    	{
    		public void m22()
    		{
    			System.out.println("---INnerclass2 m22()---");
            	System.out.println("The value of y:"+y);
    		}
    	}
    	public void access()
    	{
    		SubClass2 ob2 = new SubClass2();
    		SubClass22 ob22 = new SubClass22();
    		System.out.println("---access()---");
        	System.out.println("The value of x:"+x);
        	System.out.println("The value of y:"+y);
    		this.dis1();
    		PDisplay.dis2();
    		ob2.m2();
    		ob22.m22();
    	}
    	public static PDisplay getRef()
    	{
    		PDisplay ob = new PDisplay();
    		return ob;
    	}
    	
    
}
