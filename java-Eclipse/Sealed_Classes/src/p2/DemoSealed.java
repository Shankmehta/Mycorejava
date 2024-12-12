package p2;
import p1.*;

public class DemoSealed {

	public static void main(String[] args) 
	{
		System.out.println("====Object-B=====");
		B ob1 = new B();
		ob1.mA();
		ob1.mB();
		System.out.println("===Object-C===");
		C ob2 = new C();
		ob2.mA();
		ob2.mC();
		System.out.println("===Object-E");
		E ob3= new E();
		ob3.mA();
		ob3.mD();
		ob3.mE();

	}

}
