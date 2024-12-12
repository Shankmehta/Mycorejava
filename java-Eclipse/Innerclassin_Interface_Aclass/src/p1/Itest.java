package p1;

public interface Itest 
{
    public static class Subclass
    {
    	public void m(int x)
    	{
    		System.out.println("interface innerclass");
    		System.out.println("Value of x="+x);
    	}
    }
}
