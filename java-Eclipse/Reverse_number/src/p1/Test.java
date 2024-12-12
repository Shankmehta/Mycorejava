package p1;

public class Test 
{
   public int sum=0,r;
   public int getReverse(int n)
   {
	   while(n>0)
	   {
		   r=n%10;
		   sum=sum*10+r ;
		   n=n/10;
	   }
	   return sum;
   }
    
}
