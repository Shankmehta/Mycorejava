package p1;

public class Iclass implements Itest1,Itest2
{
	public  void m1(int x)
	{
		System.out.println("****abstract method");
		System.out.println("value of x="+x);
	}
}
