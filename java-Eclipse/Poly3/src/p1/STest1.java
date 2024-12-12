package p1;

public class STest1 
{
 private static STest1 ob;
 private STest1() {}
 
 static
 {
	 ob = new STest1();
 }
   public static STest1 getRef()
   {
	   return ob;
   }
   public void dis(int k)
   {
	   System.out.println("====Instance dis===");
	   System.out.println("the value k:"+k);
   }
}
