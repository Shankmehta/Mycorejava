package maccess;
import java.util.Scanner;
@SuppressWarnings("serial")
public class DemoException extends Exception
{
      public DemoException(String msg)
      {
    	  super(msg);
      }
      public static void main(String[] args)
      {
      Scanner s = new Scanner(System.in);
      try
      {
    	  
    	  System.out.println("Enter the marks of core java");
    	  int marks =Integer.parseInt(s.nextLine());
    	  if(marks<0 || marks>100 )
    	  {
    		  DemoException ob1 = new DemoException("Invalid marks");
    		  throw ob1;
    	  }
    	  else if(marks>0 && marks<34)
    	  {
    		  DemoException ob1 = new DemoException("Failed in  core java");
    		  throw ob1; 
    	  }
    	  else
    	  {
    		  DemoException ob1 = new DemoException("Valid marks");
    		  System.out.println("Marks in  core java="+marks);
    		  throw ob1; 
    	  }
    	  
      }
      catch(NumberFormatException | DemoException  ob1)
      {
//    	  System.out.println("Enter the integer value only");
    	  System.out.println(ob1.getMessage());
      }
//      catch(DemoException ob1)
//      {
//    	  System.out.println(ob1.getMessage());
//    	 
//      }
      finally
      {
    	  s.close();
      }
      
    }   
      
}
