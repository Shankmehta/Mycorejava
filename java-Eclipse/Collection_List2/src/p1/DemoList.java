package p1;
import java.util.*;
import java.util.function.*;
public class DemoList {

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(new Integer(12));
		ob.add(new Integer(17));
		ob.add(new Integer(11));
		ob.add(new Integer(6));
		ob.add(new Integer(14));
		System.out.println("=====LIst(E)====");
		System.out.println(ob.toString());
		
		Predicate<Integer> pr =(n)->
		{
			int count=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
				if(count==2)
					return true;
				else return false;
			
		};
		System.out.println("===Iterator==forEachREmaining===");
		Iterator<Integer> it = ob.iterator();
		it.forEachRemaining((k)->
		{
			if(pr.test(k))
			{
				System.out.print(k+" ");
			}
		});
		System.out.println("\n===Display list wihout primes===");
		Iterator<Integer> it2 = ob.iterator();
		while(it2.hasNext())
		{
			Integer i =it2.next();
			if(pr.test(i))
			{
			  it2.remove();	
			}
		}
		System.out.println(ob.toString());

	}

}
