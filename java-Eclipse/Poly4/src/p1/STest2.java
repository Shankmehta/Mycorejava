package p1;

public class STest2
{
    private static STest2 ob;
    private STest2() {}
    
    public static STest2 getRef()
    {
    	if(ob==null)
    	{
    		ob = new STest2();
    	}
    	return ob;
    }
    public void dis(int k)
    {
    	System.out.println("====Instance dis===");
    	System.out.println("the value of k="+k);
    }
}
