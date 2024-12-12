package p1;

public interface Itest1 
{
    public abstract void m1(int x);
    public static void m2(int y)
    {
    	System.out.println("****m2 static test1****");
    	System.out.println("value of y="+y);
    }
    public default void m3(int z)
    {
    	System.out.println("****m3 default   test1****");
    	System.out.println("value of z="+z);
    }
}
