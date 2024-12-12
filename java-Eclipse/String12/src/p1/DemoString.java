package p1;

public class DemoString 
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("DEfault capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
		sb.append("Language");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
		sb.append("programming");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
		sb.insert(0,"java");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
		sb.delete(4, 12);
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
		sb.deleteCharAt(3);
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
		sb.reverse();
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length of sb:"+sb.length());
		}

}
