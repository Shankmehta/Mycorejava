package p2;
import p1.TransLog;
import java.util.*;
public class DemoRecord 
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter the hAccno");
				long hAccno=s.nextLong();
				System.out.println("Enter the bAccno");
				long bAccno=s.nextLong();
				System.out.println("Enter the amt to be transferred");
				float amt=s.nextFloat();
				TransLog ob = new TransLog(hAccno,bAccno,amt,new Date());
				
				System.out.println("===Transation Details===");
				System.out.println("HAccno:="+ob.hAccno());
				System.out.println("BAccno:="+ob.bAccno());
				System.out.println("Amount:"+ob.amt());
				System.out.println("DateTime:"+ob.dTime());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
