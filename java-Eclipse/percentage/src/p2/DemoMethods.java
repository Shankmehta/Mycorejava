package p2;
import p1.Percentage;
public class DemoMethods
{
  public static void main(String[] args)
  {
	  int A=20,B=30,C=55,D=53,E=47;
	  Percentage ob = new Percentage();
	  float res=ob.per(A, B, C, D, E);
	  System.out.println("result="+res);
	  
  }
}
