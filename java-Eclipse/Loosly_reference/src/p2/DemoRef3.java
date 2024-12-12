package p2;
import p1.*;
import java.util.Scanner;
public class DemoRef3
{

	public static void main(String[] args)
	{
	    Scanner s = new Scanner(System.in);
	    Account ac= new Account();
	    CreateAccount ca = new CreateAccount(ac);
        DisplayAccount da = new DisplayAccount(ac);
        System.out.println("Enter the account number");
        long accno = Long.parseLong(s.nextLine());
        System.out.println("Enter the costumber name");
        String cname = s.nextLine();
        System.out.println("Enter the balance");
        float bal = Float.parseFloat(s.nextLine());
        System.out.println("Enter the Account type");
        String acctype = s.nextLine();
        ca.create(accno,cname,bal,acctype);
        da.dis();
        s.close();
	}

}
