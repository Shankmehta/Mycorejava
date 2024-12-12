package p2;
import p1.Test;
import java.util.Scanner;
public class DemoSum {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value ");
	    int v1=s.nextInt();
	    Test ob = new Test();
	    int res=ob.getSum(v1);
	    System.out.println("Result="+res);

	}

}
