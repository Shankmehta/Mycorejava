package p2;
import p1.*;
import java.util.Scanner;
public class StudentDetails 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Student sc = new Student();
		ReadDetails rd = new ReadDetails(sc);
		DisplayDetails dd = new DisplayDetails(sc);
		rd.read(s);
		dd.getDisplay();
		
	}
}