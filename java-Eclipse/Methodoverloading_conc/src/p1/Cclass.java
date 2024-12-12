package p1;

public class Cclass extends Pclass
{
   public Cclass(int a,int b)
   {
	   super(a);
	   System.out.println("value of b="+b);
   }
   public Cclass(int a,int b,int c)
   {
	   this(a,b);
	   System.out.println("value of c="+c);
   }
}
