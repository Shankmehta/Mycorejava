package p1;

public class DemoString 
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("NIT-HYD");
		System.out.println("Default capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
		sb.append("java language programming");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
	}

}
