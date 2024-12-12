package maccess;

public class DemoWrapper {

	
	@SuppressWarnings({ "unused", "removal" })
	public static void main(String[] args) 
	{
	Integer ob1 = new Integer(12);
	   Integer ob2 = new Integer("13");
	   Float ob3 = new Float(12.3F);
	   Float ob4 = new Float("23.5F");
	   Float ob5 = new Float(44.55);
	   Character ob6 = new Character('A');
	   Boolean ob7 = new Boolean(true);
	   Boolean ob8 = new Boolean("true");

	   
	 System.out.println("Value in ob1:"+ob1.toString());
	 System.out.println("Value in ob2:"+ob2.toString());
	 System.out.println("Value in ob3:"+ob3.toString());
	 System.out.println("Value in ob4:"+ob4.toString());
	 System.out.println("Value in ob5:"+ob5.toString());
	 System.out.println("Value in ob6:"+ob6.toString());
	 System.out.println("Value in ob7:"+ob7.toString());
	 System.out.println("Value in ob8:"+ob8.toString());
	}

}
