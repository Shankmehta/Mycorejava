package p1;

public class Access 
{
    public static Icalculate getRef()
    {
    	Icalculate ob = new Icalculate()
    			{
    		        public double cal(double k)
    		        {
    		        	return Math.sqrt(k);
    		        }
    			};
    			return ob;
    }
}
