package p1;
import java.util.*;
public record TransLog(long hAccno,long bAccno,float amt,Date dTime)
{
    public TransLog
    {
    	if(hAccno==0 || bAccno==0)
    	{
    		throw new IllegalArgumentException("Invalid HAccno");
    	}
    	if(amt<=0)
    	{
    		throw new IllegalArgumentException("Invalid amt");
    	}
    }
}
