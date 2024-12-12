package p1;

public interface Itest 
{
	
	 public abstract void m3(int x);
      public static void m1(int k)
      {
    	  System.out.println("value of k="+k);
      }
      public default void m2(int m)
      {
    	  System.out.println("value of m="+m);
      }
}
