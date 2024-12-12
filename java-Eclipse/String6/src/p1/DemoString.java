package p1;
import java.util.*;
public class DemoString 
{

	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  try(s;)
	  {
		  System.out.println("Enter the string1");
		  String s1 =s.nextLine();
		  System.out.println("Enter the string2");
		  String s2 =s.nextLine();
		  System.out.println("----compareto()----");
		  int k= s1.compareTo(s2);
		  if(k==0)System.out.println("Strings Are Equal");
		  else if(k>0)System.out.println(s1+"greater than"+s2);
		  else System.out.println(s1+"is less than "+s2);
		  
		  System.out.println("----comparetoIgnorecase()----");
		  int z= s1.compareToIgnoreCase(s2);
		  if(z==0)System.out.println("Strings Are Equal");
		  else if(z>0)System.out.println(s1+"greater than"+s2);
		  else System.out.println(s1+"is less than "+s2);
	  }

	}

}
