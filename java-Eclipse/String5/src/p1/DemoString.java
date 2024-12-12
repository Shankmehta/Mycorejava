 package p1;
import java.util.*;
public class DemoString {

	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    try(s;)
	    {
	    	System.out.println("Enter the String1");
	    	String s1=s.nextLine().trim();
	    	System.out.println("ENter the String2");
	    	String s2=s.nextLine().trim();
	    	boolean p=s1.equals(s2);
	    	if(p)
	    	{
	    		System.out.println("Strings are equal..");
	    	}
	    	else
	    	{
	    		System.out.println("Strings are not equal..");
	    	}
	    	boolean q=s1.equalsIgnoreCase(s2);
	    	if(q)
	    	{
	    		System.out.println("Strings are equal..");
	    	}
	    	else
	    	{
	    		System.out.println("Strings are not equal..");
	    	}
	    }

	}

}
