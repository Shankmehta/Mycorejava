package p2;
import p1.*;
public class Demoinnerclass 
{
	public static void main(String[] args) 
	{
		Subclass.Itest1 ob1 = (int a)->
		{
			
			System.out.println("Value of a="+a);
		};
		ob1.m1(10);
		Subclass.Itest2 ob2 = (int b)->
		{
			System.out.println("Value of b="+b);
		};
		ob2.m2(20);
		Itest.Itest3 ob3 = (int c)->
		{
			System.out.println("Value of c="+c);
		};
		ob3.m3(30);
		Aclass.Itest4 ob4= (int d)->
		{
			System.out.println("Value of d="+d);
		};
		ob4.m4(40);
		Aclass.Itest5 ob5= (int e)->
		{
			System.out.println("Value of e="+e);
		};
		ob5.m5(50);
	}

}
