package p1;
import java.util.*;
public class DemoList6 {

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Vector<Integer> ob = new Vector<Integer>();
		System.out.println("Default Capacity:"+ob.capacity());
		System.out.println("Size ob ob:"+ob.size());
		for(int i=101;i<=110;i++)
		{
			ob.addElement(new Integer(i));
		}
		System.out.println("====Vector<E>====");
		System.out.println(ob.toString());
		System.out.println(" Capacity:"+ob.capacity());
		System.out.println("Size of ob:"+ob.size());
       
		
		System.out.println("====Insert element====");
		ob.insertElementAt(new Integer(600), 4);
		System.out.println(ob.toString());
		System.out.println(" Capacity:"+ob.capacity());
		System.out.println("Size of ob:"+ob.size());
		
		System.out.println("====Enumeration<E>====");
		Enumeration<Integer> e1 =ob.elements();
		while(e1.hasMoreElements())
		{
			System.out.print(e1.nextElement() + " ");
		}
		System.out.println("\n====Enumeration<E> asiterator====");
		Enumeration<Integer> e2 = ob.elements();
		Iterator<Integer> it = e2.asIterator();
		it.forEachRemaining((k)->
		{
			System.out.print(k +" ");
		});

		
	}

}
