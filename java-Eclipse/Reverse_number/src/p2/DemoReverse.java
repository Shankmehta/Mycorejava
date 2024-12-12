package p2;
import p1.Test;
import java.util.Scanner;
public class DemoReverse {

	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("enter the number");
	  int v1 =s.nextInt();
	  Test ob = new Test();
	 int res= ob.getReverse(v1);
	 System.out.println("Result="+res);
	}

}
