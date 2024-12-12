package p2;

import p1.*;

public class DemoThread 
{

	public static void main(String[] args) 
	{
		Selection ob= new Selection();
		User1 ob1= new User1(ob);
		User2 ob2 = new User2(ob);
		
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		
		t1.start();
		t2.start();

	}

}
