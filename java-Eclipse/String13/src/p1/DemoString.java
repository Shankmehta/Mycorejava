package p1;

public class DemoString 
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer(5);
		System.out.println("Default capacity:"+sb.capacity());
		System.out.println("Lenth of sb:"+sb.length());
		sb.append("NIT");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
        sb.append("HYD");
        System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
	}

}
