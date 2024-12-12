package p2;
import p1.*;
public class DemoInnerclass 
{

	public static void main(String[] args) 
	{
		Subclass1 ob1 = new Subclass1();
		ob1.m1();
		Subclass1.Subclass2 ob2 = new Subclass1.Subclass2();
         ob2.m2();
         Subclass1.Subclass2.m22();
	}

}
