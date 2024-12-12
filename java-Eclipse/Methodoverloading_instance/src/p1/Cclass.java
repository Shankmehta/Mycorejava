package p1;

public class Cclass extends Pclass
{
	public void m1(int a,int b, int c)
	   {   
		super.m1(a,b);
		  System.out.println("Value of c="+c); 
	   }
	   public void m1(int a,int b,int c,int d)
	   {
		   this.m1(a,b,c);
		   System.out.println("Value of d="+d);
	   }
}
