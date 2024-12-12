package p1;

public interface ITest 
{
    public abstract void m1(int x);
    public default void m2(int y)
    {
    	System.out.println("Default m2");
    	System.out.println("value of y="+y);
    }
}
