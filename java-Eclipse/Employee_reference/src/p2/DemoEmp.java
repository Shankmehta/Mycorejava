package p2;
import p1.*;
import java.util.Scanner;
public class DemoEmp 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.println("Enter the id");
		 e.id = Integer.parseInt(s.nextLine());
		System.out.println("Enter the name");
		 e.name = s.nextLine();
		System.out.println("Enter the designation");
		e.desg = s.nextLine();
		
		System.out.println("Enter the hno");
		e.ad.hno = Integer.parseInt(s.nextLine());
		System.out.println("Enter the sname");
		e.ad.sname = s.nextLine();
		System.out.println("Enter the city");
		e.ad.city = s.nextLine();
		System.out.println("Enter the state");
		e.ad.state= s.nextLine();
		System.out.println("Enter the pincode");
		e.ad.pincode = s.nextLine();
		
		
		System.out.println("Enter the mailid");
		e.ct.mid = s.nextLine();
		System.out.println("Enter the phnoeno");
		e.ct.phno= s.nextLong();
		
		e.getEmployee();
		e.ad.getAddress();
		e.ct.getContact();
        s.close();
	}

}
