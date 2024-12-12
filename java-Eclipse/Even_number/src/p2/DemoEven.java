package p2;
import p1.Even;
import java.util.Scanner;
public class DemoEven 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int v1 =s.nextInt();
		Even ob =new Even();
		ob.getEven(v1);

	}

}
