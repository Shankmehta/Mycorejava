package maccess;
import java.util.*;
@SuppressWarnings("serial")
public class DemoException1 extends Exception
{
       public DemoException1(String msg)
        {
    	    super(msg);
        }
       public static void main(String[] args)
       {
    	   Scanner s = new Scanner(System.in);
    	     try
    	     {
    	    	 
    	    	 System.out.println("Enter the Emp_Bsal:");
    	    	 int bsal = Integer.parseInt(s.nextLine());
    	    	 if(bsal<12000)
    	    	 {
    	    		 DemoException1 de = new DemoException1("Invalid bsal");
    	    		 throw de;
    	    	 }
    	    	 
    	    	 float totalsal = bsal+(0.93F*bsal)+(0.61F*bsal);
    	    	 System.out.println("Emp_BSal : "+bsal);
    	    	 System.out.println("Emp-totalSal="+totalsal);
    	    	 s.close();
    	     }
    	     catch(NumberFormatException nfe)
    	     {
    	    	 System.out.println("Enter only Interger value");
    	     }
    	     catch(DemoException1 de)
    	     {
    	    	 System.out.println(de.getMessage());
    	     }
    	     finally
    	     {
    	    	 s.close();
    	     }
       }
}
