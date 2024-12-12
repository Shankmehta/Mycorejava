package p2;
import p1.Books;
public class DemoEnum {

	public static void main(String[] args) 
	{
		Books b[]=Books.values();
		System.out.println("====Displa Enum====");
		for(Books k : b)
		{
			System.out.println("Cost Of:"+k.toString()+ "is="+k.getPrice());
		}

	}

}
