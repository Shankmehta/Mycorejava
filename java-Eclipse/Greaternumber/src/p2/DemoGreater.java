package p2;
import p1.Test;
import java.util.Scanner;
public class DemoGreater 
{

	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the value x");
	    int v1=s.nextInt();
	    System.out.println("Enter the value y");
	    int v2=s.nextInt();
	    System.out.println("Enter the value z");
	    int v3=s.nextInt();
	    Test ob =new Test();
	   int res= ob.getGreatest(v1, v2, v3);
	   System.out.println("Result="+res);
	}

}
