package p2;
import p1.User;
import java.io.*;

public class DemoDeserialization {

	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fis = new FileInputStream("F:\\SVVV\\Obj.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			User ob2 = (User)ois.readObject();
			System.out.println("****UserDetails****");
			System.out.println(ob2.toString());
			ois.close();
			fis.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
