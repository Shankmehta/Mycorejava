package p2;
import p1.*;
import java.util.Scanner;
public class DemoInterface 
   
 {
        int v1,v2;
	public static void main(String[] args)
	{
	  Scanner s = new Scanner(System.in);
	  
	  System.out.println("****Choice****");
	  System.out.println("1.Addtion \n2.Substraction \n3.Mutiplication \n4.Division  \n5.ModDivision");
	  System.out.println("Enter the choice");
	  int choice=s.nextInt();
	  switch(choice)
	  {
	  case 1:
		  System.out.println("enter the number 1");
		  int v1=s.nextInt();
		  System.out.println("enter the number 2");
		  int v2=s.nextInt();
		  Addition ob1 = new Addition();
		  double res=ob1.cal(v1, v2);
		  System.out.println("Result="+res);
		  break;
	  case 2:
		  System.out.println("enter the number 1");
		  int p1=s.nextInt();
		  System.out.println("enter the number 2");
		  int p2=s.nextInt();
		  Substraction ob2 = new Substraction();
		 double res1= ob2.cal(p1, p2);
		 System.out.println("Result="+res1);
		  break;
	  case 3:
		  System.out.println("enter the number 1");
		  int t1=s.nextInt();
		  System.out.println("enter the number 2");
		  int t2=s.nextInt();
		  Multiplication ob3 = new Multiplication();
		 double res2= ob3.cal(t1, t2);
		 System.out.println("Result="+res2);
		  break;
	  case 4:
		  System.out.println("enter the number 1");
		  int s1=s.nextInt();
		  System.out.println("enter the number 2");
		  int s2=s.nextInt();
		  Division ob4 = new Division();
		  double res3=ob4.cal(s1, s2);
		  System.out.println("Result="+res3);
		  break;
	  case 5:
		  System.out.println("enter the number 1");
		  int l1=s.nextInt();
		  System.out.println("enter the number 2");
		  int l2=s.nextInt();
		  ModDivision ob5 = new ModDivision();
		  double res4=ob5.cal(l1,l2);
		  System.out.println("Result="+res4);
		  break;
		  default:
			  System.out.println("invalid choice");
	  }

	}

}
