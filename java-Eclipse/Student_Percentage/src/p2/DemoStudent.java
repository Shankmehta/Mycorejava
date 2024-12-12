package p2;
import p1.Percentage;
import java.util.Scanner;
public class DemoStudent
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int i=1,sum=0;
		while(i<=6)
		{
			System.out.println("Enter the number"+i);
			int v1=s.nextInt();
			sum=sum+v1;
			i++;
		}
		
		Percentage ob = new Percentage();
		float res=ob.getPercentage(sum);
		System.out.println("Result="+res);
				
	}

}
