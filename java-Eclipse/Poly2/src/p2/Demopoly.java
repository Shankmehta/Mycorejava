package p2;
import p1.TransLog;
import java.util.*;
public class Demopoly 
{

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		try(s;)
		{
			try
			{
			System.out.println("Enter the hAccno");
			long haccno=s.nextLong();
			System.out.println("Enter the bAccno");
			long baccno=s.nextLong();
			System.out.println("Enter the amt to be Transferred");;
			float amt=s.nextFloat();
			TransLog ob = new TransLog(haccno,baccno,amt,new Date());
			System.out.println("====Log Details====");
			System.out.println("Haccno:"+ob.getHaccno());
			System.out.println("Baccno:"+ob.getBaccno());
			System.out.println("Amt:"+ob.getamt());
			System.out.println("Date and time:"+ob.getdtime());
		     }
       catch(Exception e)
		{
    	   e.printStackTrace();
		}
			
		}
	}

}
