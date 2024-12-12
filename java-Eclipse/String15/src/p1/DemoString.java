package p1;

public class DemoString {

	public static void main(String[] args) 
	{
         StringBuffer sb1 = new StringBuffer("NIT_HYD");
         StringBuffer sb2 = new StringBuffer(sb1);
         System.out.println("Default capacity of sb2:"+sb2.capacity());
         System.out.println("Length of sb2:"+sb2.length());
         sb2.append("java programming language");
         System.out.println("Data in sb2:"+sb2.toString());
 		System.out.println("capacity:"+sb2.capacity());
 		System.out.println("Length of sb2:"+sb2.length());
	}

}
