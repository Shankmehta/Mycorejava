package test;

@SuppressWarnings("serial")
public class CheckBranch extends Exception
{
      public CheckBranch(String msg)
      {
    	  super(msg);
      }
      public void check(String br)throws CheckBranch
      {
    	  try
    	  {
    		  switch(br)
    		  {
    		  case "CSE":
    			  break;
    		  case "ECE":
    			  break;
    		  case "EEE":
    			  break;
    			  default:
    				  CheckBranch cb = new CheckBranch("Invalid branch");
    				  throw cb;
    		  }
    	  }
    	  catch(CheckBranch cb)
    	  {
    		throw cb;  
    	  }
      }
}
