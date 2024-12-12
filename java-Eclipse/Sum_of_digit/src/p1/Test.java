package p1;

public class Test 
{
    int sum=0,r;
    public int getSum(int x)
    {
    	while(x>0)
    	{
    		r=x%10;
    		sum=sum+r;
    		x=x/10;
    	}
    	return sum;
    }
}
