package maccess;
import java.util.*;
public class DemoArray 
{

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				Integer a[][] = new Integer[3][3];
				System.out.println("Enter the 3*3 matrix");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						a[i][j]=new Integer(s.nextInt());
					}
				}
				System.out.println("=====Display 3*3 matrix====");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						System.out.print(a[i][j]+" ");	
					}
					System.out.println();
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
