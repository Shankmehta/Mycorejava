package p2;
import java.util.Scanner;

import p1.Itest;
public class DemoLambda 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no1");
	     int v1 =s.nextInt();
	     System.out.println("Enter the no2");
	     int v2 =s.nextInt();
	     System.out.println("*****CHoice****");
	     System.out.println("1.Greatervalue  \n2.Smallervalue");
	     System.out.println("Enter the choice");
	     int choice = s.nextInt();
	     switch(choice)
	     {
	     case 1:
	    	 Itest ob1 = (int x,int y)->
	    	 {
	    			if(x>y) return x;
	    			else return y;
	    	 };
	    	int res= ob1.getvalue(v1,v2);
	    	System.out.println("Result="+res);
	    	 break;
	     case 2:
	    	 Itest ob2 = (int x,int y)->
	    	 {
	    			if(x<y) return x;
	    			else return y;
	    	 };
	    	int res1= ob2.getvalue(v1,v2);
	    	System.out.println("Result="+res1);
	    	 break;
	    	 default:
	    		 System.out.println("Invalid choice");
	     }
	     s.close();

	}

}
