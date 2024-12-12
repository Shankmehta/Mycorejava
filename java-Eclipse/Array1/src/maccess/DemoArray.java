package maccess;
import java.util.*;
public class DemoArray 
{

  @SuppressWarnings("removal")
public static void main(String[] args) 
	{
	Scanner s  = new Scanner (System.in);
	{
		try(s;)
		{
			try
		{
			System.out.println("Enter the number of Integer elements");
			int n = s.nextInt();
			
			Integer a[]= new Integer[n];
			System.out.println("Enter the "+n+" Integer elements");
			for(int i=0;i<a.length;i++)
			{
			  a[i]= new Integer(s.nextInt());	
			}
			System.out.println("Display Array using old For Loop");
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i].toString()+" ");
			}
			System.out.println("\n=====Display array using Entended for loop==");
			for(Integer k : a)
			{
				System.out.print(k.toString()+" ");
			}
			System.out.println("\n====Array using spliterator<T>");
			Spliterator<Integer> sp2 = Arrays.spliterator(a);
			sp2.forEachRemaining((k)->
			{
				System.out.print(k.toString()+" ");
			});
			System.out.println("\n====Sorted Array===");
			Arrays.sort(a);
			Spliterator<Integer> sp3 = Arrays.spliterator(a);
			sp3.forEachRemaining((k)->
			{
				System.out.print(k.toString()+" ");
			});
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
			
	}

	}

}
