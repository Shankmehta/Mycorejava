package p1;
import java.util.*;
public class DemoDeque {

	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		ArrayDeque<Integer> ad =new ArrayDeque<Integer>();
		ad.add(new Integer(12));
		ad.add(new Integer(13));
		ad.add(new Integer(14));
		ad.add(new Integer(12));
		ad.add(new Integer(15));
		System.out.println(ad.toString());
        ad.addFirst(new Integer(100));
        ad.addLast(new Integer(200));
        System.out.println(ad.toString());
        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad.toString());
        ad.offerFirst(new Integer(14));
        ad.offerLast(new Integer(13));
        System.out.println(ad.toString());
        ad.removeFirstOccurrence(new Integer(14));
        System.out.println(ad.toString());
        ad.removeLastOccurrence(new Integer(12));
        System.out.println(ad.toString());
       System.out.println("====Iterator<E>====");
        Iterator<Integer> it = ad.iterator();
        it.forEachRemaining((k)->
        {
        	System.out.print(k +" ");
        });
        System.out.println("\n====Descending Iterator<E>====");
        Iterator<Integer> it2 = ad.descendingIterator ();
        it2.forEachRemaining((k)->
        {
        	System.out.print(k +" ");
        });
	}

}
