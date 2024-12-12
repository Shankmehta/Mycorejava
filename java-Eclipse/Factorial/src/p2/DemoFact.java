package p2;
import p1.Fact;
import java.util.Scanner;
public class DemoFact 
{
  public static void main(String[] args)
  {
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enetr the number");
	  int v1 = s.nextInt();
	  Fact ob = new Fact();
	 int res= ob.getFact(v1);
	 System.out.println("result="+res);
  }
}
