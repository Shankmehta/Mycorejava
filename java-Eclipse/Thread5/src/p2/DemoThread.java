package p2;
import p1.*;
public class DemoThread {

	public static void main(String[] args) 
	{
      Producer p = new Producer();
      Consumer c= new Consumer(p);
      Thread t1 = new Thread(p);
      Thread t2 = new Thread(c);
     
      t2.setPriority(Thread.MAX_PRIORITY);
      t1.setPriority(Thread.MIN_PRIORITY);
      
      t2.start();
      t1.start();
      
	}

}
