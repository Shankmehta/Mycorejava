package p1;
import java.util.*;
public class DemoSet1 
{

	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		try(s;)
		{
			try 
			{
				Set<Integer> ob=null;
				String nm=null;
				while(true) {
					System.out.println("----Choice---");
					System.out.println("\t1.HashSet"
							+ "\n\t2.LinkedHashSet"
							+ "\n\t3.TreeSet"
							+ "\n\t.4.Exit");
					System.out.println("Enter the choice");
					switch(s.nextInt())
					{
					case 1:
						ob =new HashSet<Integer>();
						nm="HashSet";
						break;
					case 2:
						ob = new LinkedHashSet<Integer>();
						nm="LinkedHashSet";
						break;
					case 3:
						ob= new TreeSet<Integer>();
						nm ="TreeSet";
						break;
					case 4:
						System.out.println("Opration Stopped");
						System.exit(0);
					default:
						System.out.println("Invalid choice");
						continue;
					}
					System.out.println("Perform operation on"+nm);
					xyz:while(true) {
						System.out.println("Choice");
						System.out.println("\t1.add(E)"
								+ "\n\t2.remove(Object)"
								+ "\n\t3.Exit");
						System.out.println("Enter the Choice");
						switch(s.nextInt())
						{
						case 1:
							System.out.println("Enter the ele:");
							ob.add(new Integer(s.nextInt()));
						    System.out.println(ob.toString());
						   break;
						case 2:
							if(ob.isEmpty())
							{
							System.out.println(nm +"is empty.. ");
							}
							else
							{
								System.out.println("Enter the ele to be removed");
								Integer e1 = new Integer(s.nextInt());
								  if(ob.remove(e1))
								  {
									  System.out.println(e1+"is removed");
								  }
								  else
								  {
									  System.out.println("Element not available");
								  }
							}
							break;
						case 3:
							System.out.println("Operation stopped on"+nm);
							break xyz;
							default:
								System.out.println("invalid choice");
						}
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
