package p2;
import p1.Itest;
public class DemoLambda 
{
	public static int b=20;
	public static void main(String[] args) 
	{
		int c =30;
        Itest ob = (int z)->
        {
        	System.out.println("lambda expression");
//        	System.out.println("value of a="+a);
        	System.out.println("value of b="+b);
        	System.out.println("value of c="+c);
        };
        ob.dis(100);
       

	}

}
