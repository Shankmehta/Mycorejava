package p2;
import p1.*;
public class DemoGeneric {

	@SuppressWarnings({ "removal", "unused" })
	public static void main(String[] args) 
	{
		Display<Integer>ob1= new Display<Integer>();
        Display<String>ob2= new Display<String>();
        Display<User>ob3 = new Display<User>();
        
        ob1.setOb(new Integer(12));
        ob2.setOb(new String("Hyd-NIT"));
        ob3.setOb(new User("Ram","R@gmail.com"));
        
        System.out.println("Intvalue:"+ob1.getOb());
        System.out.println("String value:"+ob2.getOb());
        System.out.println("User Details:"+ob3.getOb());
	}

}
