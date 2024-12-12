package p1;
import java.util.*;
public class DemoString 
{

	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	   try(s;)
	   {
		System.out.println("Enter the String");
		String str= s.nextLine();
		int len=str.length();
		int k = len-1;
		int count=0;
		for(int i=0;i<=len-1;i++)
		{
			if(str.charAt(i)==str.charAt(k))
			{
				count++;
			}
			else
			{
				break;
			}
			k--;
		}
		if(count==len)
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	   }
  }
}
