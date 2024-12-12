package p2;
import p1.*;
import java.util.*;
public class StudentTester 
{

	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the StudentId");
	  int stuid = Integer.parseInt(s.nextLine());
	  System.out.println("Enter the StudentName");
	  String sname = s.nextLine();
	  System.out.println("Enter the TotalAmt(1500+25000+30000):");
	  int amt = s.nextInt();
	  System.out.println("*****Choice*****");
	  System.out.println("1.DayScholar" + "2.Hosteller");
	  System.out.println("Enter the choice");
	  int choice = s.nextInt();
	  switch(choice)
	  {
	   case 1:
		  DayScholar ob1 = new DayScholar();
		  ob1.studentId=stuid;
		  ob1.name=sname;
		  System.out.println(ob1.displayDetails());
		  System.out.println("Remaining amount:"+ob1.payFee(amt));
	   break;
	   
	   case 2:
		  Hosteller ob2 = new Hosteller();
		  ob2.studentId=stuid;
		  ob2.name=sname;
		  System.out.println(ob2.displayDetails());
		  System.out.println("Remaning amount:"+ob2.payFee(amt));
		break;
		default:
			System.out.println("invalid choice");
			
	  }
	  s.close();
	}

}
