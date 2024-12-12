package p1;

public abstract class Aclass 
{
   public static class Subclass1
   {
	   public void m1(int a)
	   {
		   System.out.println("Abstract static");
   		System.out.println("Value of a="+a);
	   }
   }
   public class Subclass2
   {
	   public void m2(int b)
	   {
		   System.out.println("Abstract non static");
   		System.out.println("Value of b="+b);
	   }
   }
}
