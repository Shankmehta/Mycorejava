package p1;

public interface Itest2 
{
	public abstract void m1(int x);
    public static void m2(int y)
    {
    	System.out.println("****m2 static   test 2****");
    	System.out.println("value of y="+y);
    }
    public default void m33(int z)
    {
    	System.out.println("****m3 default   test2****");
    	System.out.println("value of z="+z);
    }
}
