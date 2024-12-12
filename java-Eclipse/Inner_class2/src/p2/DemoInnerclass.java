package p2;
import p1.*;
public class DemoInnerclass 
{

	public static void main(String[] args) 
	{
		Subclass1 ob = new Subclass1();
		ob.m1();
		Subclass1.Subclass2 ob1 = ob.new Subclass2();
        ob1.m2();
        Subclass1.Subclass2.m22();
	}

}
