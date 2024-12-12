package p1;

public class DemoString {

	public static void main(String[] args) 
	{
		String str ="language";
		String sub1= str.substring(2);
		System.out.println("Substring:"+sub1.toString());

		String sub2 = str.substring(2,5);
		System.out.println("Substring:"+sub2.toString());
	}

}
