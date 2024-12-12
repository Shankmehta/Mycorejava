package p1;
import java.util.*;
public class DemoQueue {

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(new Integer(12));
		pq.add(new Integer(13));
		pq.add(new Integer(14));
		pq.add(new Integer(15));
		System.out.println(pq.toString());
		pq.offer(new Integer(500));
		System.out.println(pq.toString());
		pq.remove();
		System.out.println(pq.toString());
		pq.poll();
		System.out.println(pq.toString());
		System.out.println("Peek:"+pq.peek());
		System.out.println("Element:"+pq.element());
	
	}

}
