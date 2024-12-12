package p2;
import p1.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class DemoSerialization {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter the username");
				String un=s.nextLine();
				System.out.println("Enter the mailid");
				String id = s.nextLine();
				User ob1 = new User(un,id,new Date());
				FileOutputStream fos= new FileOutputStream("F:\\SVVV\\Obj.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(ob1);
				System.out.println("Object Stored Successfully");
				oos.close();
				fos.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
