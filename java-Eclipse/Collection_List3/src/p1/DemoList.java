package p1;
import java.util.*;
import java.util.function.*;
public class DemoList 
{

	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		ArrayList<Float> al = new ArrayList<Float>();
		al.add(new Float(12));
		al.add(new Float(11));
		al.add(new Float(17));
		al.add(new Float(19));
		al.add(new Float(10));
		System.out.println("=====List=====");
		System.out.println(al.toString());
		Function<Float,Float> fn=(n)->
		{
			return n+(0.7F*n);
		};
		System.out.println("====List Element after Function===");
        al.forEach((k)->
        {
        	System.out.print(fn.apply(k)+" ");
        });
        System.out.println("\n===== Original List=====");
		System.out.println(al.toString());
		  
		al.replaceAll((n)->
		{
			return n+(0.7F*n);
		});
		 System.out.println("\n===== Original List after replace=====");
			System.out.println(al.toString());
	}

}
