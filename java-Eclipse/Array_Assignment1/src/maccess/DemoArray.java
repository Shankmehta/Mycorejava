package maccess;
import java.util.*;
public class DemoArray {

	public static void main(String[] args) 
	{
	  Scanner s= new Scanner(System.in);
	  try(s;)
	  {
		  try
		  {
			 System.out.println("Enter the number of sub marks:");
			 int n = s.nextInt();
			 Integer a[]=new Integer[n];
			 int i=1,totM=0;
			 while(i<=6)
			 {
				 
				 System.out.println("Enter the Sub marks:"+i);
				 int sub =s.nextInt();
				 totM=totM+sub;
				
				 i++;
			
			 }
			 System.out.println("Total marks:"+totM);
			 Arrays.sort(a);
				System.out.println("Higest marks"+a[6]);
			 Spliterator<Integer> sp = Arrays.spliterator(a);
			 sp.forEachRemaining((k)->
			 {
				 System.out.println(k.toString());
			 });
		
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }

	}

}
