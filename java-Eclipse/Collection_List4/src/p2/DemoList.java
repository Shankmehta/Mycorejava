package p2;
import p1.*;
import java.util.*;
public class DemoList 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				ArrayList<BookDetails> al = new ArrayList<BookDetails>();
				al.add(new BookDetails("b12","cj","xyz",555.23F,12));
				al.add(new BookDetails("a13","hj","abc",211.21F,21));
				al.add(new BookDetails("c14","aj","pqr",133.23F,9));
				al.add(new BookDetails("e15","sp","mno",300.23F,4));
				al.add(new BookDetails("d16","bt","grt",455.23F,10));
				
				System.out.println("====BOokDetails===");
				al.forEach((k)->
				{
					System.out.println(k);
				});
				while(true)
				{
					System.out.println("====Sorting Process===");
					System.out.println("\t1.SortByCode"
							+ "\n\t2.SortByName"
							+ "\n\t3.SortByAuthor"
							+ "\n\t4.SortByPrice"
							+ "\n\t5.SortByQty"
							+ "\n\t6.Exit");
					System.out.println("Enter the Choice");
					switch(s.nextInt())
					{
					case 1:
						al.sort(new SortByCode());
						System.out.println("====SortByCode====");
						al.forEach((k)->
						{
							System.out.println(k);
						});
						break;
					}
				}
				
				
			}
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
