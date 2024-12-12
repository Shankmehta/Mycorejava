package p2;
import p1.*;
public class DemoReference {

	public static void main(String[] args) 
	{
		Itest ob1 = Display :: new;
		ob1.dis(100);
		Display d = new Display(10);
		Itest ob2 = d :: m1;
         ob2.dis(200);
        Itest ob3 = Display :: m2;
        ob3.dis(300);
	}

}
