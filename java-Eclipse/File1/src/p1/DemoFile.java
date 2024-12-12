package p1;
import java.io.*;
import java.util.*;
public class DemoFile 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try {
				System.out.println("Enter the sourse(fPath&fName):");
				File f1 = new File(s.nextLine());
				if(f1.exists())
				{
					FileInputStream fis = new FileInputStream(f1);
					System.out.println("Enter the Destination(fpath&fname):");
					File f2 = new File(s.nextLine());
					FileOutputStream fos = new FileOutputStream(f2);
					int k;
					while((k=fis.read())!=-1)
					{
						fos.write(k);
					}
					System.out.println("File copied successfully");
					fos.close();
					fis.close();
				}
				else
				{
					System.out.println("Invalid Fpath&Fname");
				}
				
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
