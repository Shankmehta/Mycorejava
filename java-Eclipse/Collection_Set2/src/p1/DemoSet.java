package p1;
import java.util.*;
public class DemoSet 
{

	@SuppressWarnings({ "removal", "unused" })
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		LinkedHashSet<Integer> ob1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> ob2 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> ob3 = new LinkedHashSet<Integer>();
		
		ob1.add(new Integer(11));
		ob1.add(new Integer(12));
		ob1.add(new Integer(13));
		
		ob2.add(new Integer(21));
		ob2.add(new Integer(22));
		ob2.add(new Integer(23));
		
		ob3.add(new Integer(12));
		ob3.add(new Integer(22));
		ob3.add(new Integer(32));
		
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob3="+ob3.toString());
		
		System.out.println("===addAll====");
		ob1.addAll(ob2);
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob3="+ob3.toString());
		
		System.out.println("===conatins(Object====");
		Boolean k = ob1.contains(new Integer(12));
		System.out.println("Ele 12 is available in ob1="+k);
		
		System.out.println("===conatinsAll(Object====");
		Boolean z= ob1.containsAll(ob3);
		System.out.println("ob1 conatins ob3="+z);
		
		System.out.println("===retainAll====");
		ob1.retainAll(ob3);
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob3="+ob3.toString());
		
		System.out.println("===removeAll====");
		ob3.removeAll(ob1);
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob3="+ob3.toString());
		
		System.out.println("===clear()====");
		ob2.clear();
		System.out.println("ob1="+ob1.toString());
		System.out.println("ob2="+ob2.toString());
		System.out.println("ob3="+ob3.toString());
		
		Set<Integer>ob4 = Set.of(12,13,14,15,16);
		System.out.println("ob4="+ob4.toString());
	}

}
