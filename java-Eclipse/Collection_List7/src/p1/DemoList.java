package p1;
import java.util.*;
public class DemoList 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try 
			{
			   System.out.println("Enter the String");
			   String str = s.nextLine();
			   System.out.println("Enter the delimeter");
			   String dl = s.nextLine();
			   StringTokenizer ob = new StringTokenizer(str,dl);
			   System.out.println("COunt of tokens:"+ob.countTokens());
			   System.out.println("=====Display Tokens====");
			   while(ob.hasMoreTokens())
			   {
				   String tk =ob.nextToken();
				   System.out.println(tk.toString());
			   }
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
