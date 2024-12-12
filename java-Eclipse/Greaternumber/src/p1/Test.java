package p1;

public class Test 
{
	
     public int getGreatest(int x, int y, int z)
     {
    	if(x<0||y<0||z<0)
    	{
    		return -1;
    	}
    	else if(x==0||y==0||z==0)
    	{
    		return -2;
    	}
    	else
    	{
    		if(x>y&&x>z)
    		{
    			return x;
    		}
    		else if(y>x&&y>z)
    		{
    			return y;
    			
    		}
    		else
    		{
    			return z;
    		}
    	}
     }
}
