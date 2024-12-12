package p1;

public class Prime 
{
	
	int count;
     public void getPrime(int n)
     {
    	 for(int i=1;i<=n;i++)
    	 {
    		 if(n%i==0)
    		 {
    			 count ++;
    		 }
    	 }
        if(count==2)
    		 {
    			 System.out.println("prmie number");
    		 }
    		 else
    		 {
    			 System.out.println("not a prime number");
    		 }
    	 
     }
}
