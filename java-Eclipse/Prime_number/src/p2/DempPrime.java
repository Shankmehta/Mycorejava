package p2;
import p1.Prime;
import java.util.Scanner;
public class DempPrime 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr the number");
		int v1=s.nextInt();
        Prime ob = new Prime();
        ob.getPrime(v1);
	}
}