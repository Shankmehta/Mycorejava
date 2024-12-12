package p2;
import p1.*;
public class DemoAclass {

	public static void main(String[] args) 
	{  
		Subclass ob = new Subclass();
		Subclass.Subclass1 ob1 = ob.new Subclass1()
		{
			public void m1(int a)
			{
			System.out.println("Value of a="+a);	
			}
		};
		ob1.m1(10);
		
		
		Subclass.Subclass2 ob2 = new Subclass.Subclass2()
		{
			public void m2(int b)
			{
			System.out.println("Value of b="+b);	
			}
		};
		ob2.m2(20);
            
		
		Itest.Subclass3 ob3 = new Itest.Subclass3()
		{
			public void m3(int c)
			{
			System.out.println("Value of c="+c);	
			}
		};
		ob3.m3(30);
		
		
		Aclass d = new Aclass()
				{
			       //empty
				};
		Aclass.Subclass4 ob4 = d.new Subclass4()
		{
			public void m4(int d)
			{
			System.out.println("Value of d="+d);	
			}
		};
		ob4.m4(40);
		
		
		Aclass.Subclass5 ob5 = new Aclass.Subclass5()
		{
			public void m5(int e)
			{
			System.out.println("Value of e="+e);	
			}
		};
		ob5.m5(50);
	}

}
