package maccess;

public class DemoWrapper {

	@SuppressWarnings("removal")
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

		  int i1=ob1.intValue();
		  int i2=ob2.intValue();
		  float i3 = ob3.floatValue();
		  float i4 = ob4.floatValue();
		  float i5=ob5.floatValue();
		  char i6=ob6.charValue();
		  boolean i7=ob7.booleanValue();
		  boolean i8=ob8.booleanValue();
				  
		   
		   
		 System.out.println(i1);
		 System.out.println(i2);
		 System.out.println(i3);
		 System.out.println(i4);
		 System.out.println(i5);
		 System.out.println(i6);
		 System.out.println(i7);
		 System.out.println(i8);
		}

	

}
