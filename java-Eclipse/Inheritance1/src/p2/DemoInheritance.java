package p2;
import p1.*;
import java.util.Scanner;
public class DemoInheritance
{
    public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);
    	C2 ob = new C2();
    	System.out.println("Enter the value of a");
    	ob.a=s.nextInt();
    	System.out.println("Enter the value of b");
    	C2.b=s.nextInt();
    	System.out.println("Enter the value of x");
    	ob.x=s.nextInt();
    	System.out.println("Enter the value of y");
    	C2.y=s.nextInt();
    	ob.m1();
    	C2.m11();
    	ob.m2();
    	C2.m22();
    	s.close();
    }
}
