package p2;
import p1.ITest;
public class DemoLambda 
{

	public static void main(String[] args) 
	{
		ITest ob = (int x)->
		{
			 
				 System.out.println("Abstract method");
				 System.out.println("value of x="+x);
			 
		};
		ob.m1(10);
		ob.m2(20);

	}

}
