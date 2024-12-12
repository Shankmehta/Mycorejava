package p1;

public class DemoString 
{

	public static void main(String[] args) 
	{
		System.out.println("====uppercase====");
		for(int i=65;i<=90;i++)
		{
			char ch = (char)i;
			System.out.print(ch+" ");
		}
		System.out.println("====Lowercase====");
		for(int i=97;i<=122;i++)
		{
			char ch = (char)i;
			System.out.print(ch+" ");
		}
		System.out.println("====number====");
		for(int i=48;i<=57;i++)
		{
			char ch = (char)i;
			System.out.print(ch+" ");
			
		}

	}

}
