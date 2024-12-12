package maccess;
import java.util.*;
import Test.BookDetails;
public class DemoArray {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try 
			{
				System.out.println("Enter the number of books: ");
				int n =Integer.parseInt(s.nextLine());
				
				BookDetails bd[]=new BookDetails[n];
				System.out.println("Enter  "+n+" book details");
				for(int i=0;i<bd.length;i++)
				{
					System.out.println("===Enter bookDetails "+(i+1)+"===");
					System.out.println("Enter the code:");
					String cd=s.nextLine();
					System.out.println("Enter the name:");
					String na=s.nextLine();
					System.out.println("Enter the author:");
					String at=s.nextLine();
					System.out.println("Enter the price:");
					float pr=Float.parseFloat(s.nextLine());
					System.out.println("Enter the qty:");
					int qt=Integer.parseInt(s.nextLine());
					bd[i]=new BookDetails(cd,na,at,pr,qt);
				}
				
				Spliterator<BookDetails> sp = Arrays.spliterator(bd);
				sp.forEachRemaining((k)->
				{
					System.out.println(k.toString());
				});
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
