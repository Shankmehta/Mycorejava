package p1;
import java.util.*;
public class DemoString 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str=s.nextLine();
	   int len = str.length();
         for(int i=len-1;i>=0;i--)
         {
               char ch = str.charAt(i);
               System.out.print(ch +" ");
         }
        
	}

}
