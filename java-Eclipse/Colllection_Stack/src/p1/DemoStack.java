package p1;
import java.util.*;
public class DemoStack 
{

	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Scanner s =new Scanner(System.in);
		try(s;)
		{
			try
			{
				Stack<Integer> ob = new Stack<Integer>();
				while(true)
				{
					System.out.println("===== Stack==choice====");
					System.out.println("\t1.Push"
							+ "\n\t2.Pop"
							+ "\n\t3.Peek"
							+ "\n\t4.Search"
							+ "\n\t5.Exit");
					System.out.println("Enter the Choice");
					switch(s.nextInt())
					{
					case 1:
					   System.out.println("ENter the elememnt");
					   ob.push(new Integer(s.nextInt()));
					   System.out.println(ob.toString());
						break;
					case 2:
						if(ob.empty())
						{
							System.out.println("Stack is empty");
						}
						else
						{
							ob.pop();
							System.out.println(ob.toString());
						}
						break;
					case 3:
						if(ob.empty())
						{
							System.out.println("Stack is empty");
						}
						else
						{
							System.out.println("peek"+ob.peek());
							System.out.println(ob.toString());
						}
						break;
					case 4:
						if(ob.empty())
						{
							System.out.println("Stack is empty");
						}
						else
						{
							System.out.println("enter the element to be searched");
							Integer ele = new Integer(s.nextInt());
							int pos =ob.search(ele);
							if(pos>0)
							{
								System.out.println(ele +"found at position"+pos);
								System.out.println(ob.toString());
							}
							else
							{
								System.out.println("Ele not found");
							}
						}
					   break;
					case 5:
						System.out.println("Stack operstion Stopped");
						System.exit(0);
						break;
					default:
						System.out.println("invalid choice");
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
