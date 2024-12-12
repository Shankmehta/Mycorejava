package p1;
import java.util.*;
public class Demolist 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				Vector<String> ob = new Vector<String>();
				System.out.println("Enter the number of string");
				int n =Integer.parseInt(s.nextLine());
				System.out.println("ENter  "+n+" String");
				for(int i=1;i<=n;i++)
				{
					ob.add(new String(s.nextLine()));
				}
				System.out.println("====LIst of Strings==");
				System.out.println(ob.toString());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
