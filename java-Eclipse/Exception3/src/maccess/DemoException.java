package maccess;
import java.util.*;
import test.CheckBranch;
public class DemoException 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("enter the stu-branch:");
			String br = s.nextLine().toUpperCase();
			CheckBranch ob = new CheckBranch("");
			ob.check(br);
			System.out.println("Valid stu-branch....");
			System.out.println("Branch:"+br);
		}
		catch(CheckBranch cb)
		{
		    System.out.println(cb.getMessage());	
		}
		finally
		{
			s.close();
		}

	}

}
