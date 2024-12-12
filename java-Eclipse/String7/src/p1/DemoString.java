package p1;

public class DemoString {

	public static void main(String[] args) 
	{
       System.out.println("----String new operator---");
       String s1= new String("nit");
       String s2 = new String("nit");
       if(s1==s2)System.out.println("Strings are equal");
       else System.out.println("Strings are not equal");
       
       
       System.out.println("----String literal process---");
       String s3= ("hyd");
       String s4 =("hyd");
       if(s3==s4)System.out.println("Strings are equal");
       else System.out.println("Strings are not equal");
	}

}
