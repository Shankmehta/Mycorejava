package p1;

public interface Itest
{
   private void m1(int x)
   {
	   System.out.println("value of x="+x);
   }
     public static void m3(int y)
     {
    	 System.out.println("value of y="+y);
     }
     default void m2(int x,int y)
   {
	   this.m1(x);
	   Itest.m3(y);
   }
}
