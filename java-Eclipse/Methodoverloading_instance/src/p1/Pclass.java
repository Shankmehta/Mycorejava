package p1;

public class Pclass 
{
   public void m1(int a)
   {
	  System.out.println("Value of a="+a); 
   }
   public void m1(int a,int b)
   {    
	   this.m1(a);
	   System.out.println("Value of b="+b);
   }
}
