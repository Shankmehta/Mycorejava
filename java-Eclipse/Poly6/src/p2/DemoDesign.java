package p2;
import p1.*;
public class DemoDesign 
{

	public static void main(String[] args) 
	{
		Icalculate ob = Access.getRef();
		double res = ob.cal(16);
		System.out.println("result="+res);
	}

}
