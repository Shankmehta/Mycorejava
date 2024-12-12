package p2;
import p1.Product;
import java.util.*;
public class DemoList
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		ArrayList<Product> ob = new ArrayList<Product>();
		try(s;)
		{
			try
			{
				while(true)
				{
					System.out.println("==Choice===");
					System.out.println("\t1.add(E)"
							+ "\n\t2.add(index,E)"
							+ "\n\t3.remove(Object)"
							+ "\n\t4.revome(index)"
							+ "\n\t5.get(index)"
							+ "\n\t6.set(index,E)"
							+ "\n\t7.SortbyCode"
							+ "\n\t8.EditByCode"
							+ "\n\t9.Display"
							+ "\n\t10.Exit");
					System.out.println("Enter the Choice");
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						System.out.println("Enter the Product-details-");
						System.out.println("Enter the Prod-Code:");
						String pc =s.nextLine();
						System.out.println("Enter the Prod-Name:");
						String pn =s.nextLine();
						System.out.println("Enter the Prod-Price:");
					    float pp = Float.parseFloat(s.nextLine());
					    System.out.println("Enter the Prod-Qty:");
					    int pq = Integer.parseInt(s.nextLine());
					    ob.add(new Product(pc,pn,pp,pq));
					    System.out.println("****Product-Details****");
					    ob.forEach((k)->
					    {
					    	System.out.println(k);
					    });
						break;
					case 2:
						if(ob.isEmpty())
						{
							System.out.println("List is empty");
						}
						else
						{
							System.out.println("Enter the index to add element");
							int i1= Integer.parseInt(s.nextLine());
							if(i1>=0 && i1<ob.size())
							{
								System.out.println("Enter the Product-details-");
								System.out.println("Enter the Prod-Code:");
								String pc1 =s.nextLine();
								System.out.println("Enter the Prod-Name:");
								String pn1 =s.nextLine();
								System.out.println("Enter the Prod-Price:");
							    float pp1 = Float.parseFloat(s.nextLine());
							    System.out.println("Enter the Prod-Qty:");
							    int pq1 = Integer.parseInt(s.nextLine());
							    ob.add(i1,new Product(pc1,pn1,pp1,pq1));
							    System.out.println("****Product-Details****");
							    ob.forEach((k)->
							    {
							    	System.out.println(k);
							    });
							}
							else
							{
								System.out.println("Inavlid index value...");
							}
						}
						
						break;
					case 3:
						  if(ob.isEmpty())
						  {
							  System.out.println("List is empty");
						  }
						  else
						  {
							  System.out.println("Enter the Prod-code to delete product:");
							  String pc2= s.nextLine();
							  Iterator<Product> it = ob.iterator();
							  while(it.hasNext())
							  {
								  Product p =it.next();
								  if(pc2.equals(p.code))
								  {
									  ob.remove(p);
									  System.out.println("Product removed");
									  break;
								  }
							  }
							  System.out.println("****Product-Details****");
							    ob.forEach((k)->
							    {
							    	System.out.println(k);
							    });
							  
						  }
						break;
					case 4:
					   if(ob.isEmpty())
					   {
						   System.out.println("List is empty");
					   }
					   else
					   {
						   System.out.println("Enter the index to delete the element");
						   int i2 = Integer.parseInt(s.nextLine());
						   if(i2>=0 && i2<ob.size())
						   {
							   ob.remove(i2);
							   System.out.println("Product removed");
							   System.out.println("****Product-Details****");
							    ob.forEach((k)->
							    {
							    	System.out.println(k);
							    });  
						   }
						   else {
							   System.out.println("Invalid index");
						   }
					   }
					  break;
					case 5:
						if(ob.isEmpty())
						{
							System.out.println("List IS empty");
						}
						else
						{
							System.out.println("Enter the index to get  the element");
							int i3= Integer.parseInt(s.nextLine());
							if(i3>=0 && i3<ob.size())
							{
								Product p = ob.get(i3);
								System.out.println("Product at index"+i3+"===");
								System.out.println(p.toString());
							
							   System.out.println("****Product-Details****");
							    ob.forEach((k)->
							    {
							    	System.out.println(k);
							    });  
						   }
						   else 
						   {
							   System.out.println("Invalid index");
						   }
						}
						break;
					case 6:
						if(ob.isEmpty())
						{
							System.out.println("List is empty");
						}
						else
						{
							System.out.println("Enter the index to set element");
							int i4=Integer.parseInt(s.nextLine());
							if(i4>=0 && i4<ob.size())
							{
								System.out.println("Enter the Product-details-");
								System.out.println("Enter the Prod-Code:");
								String pc1 =s.nextLine();
								System.out.println("Enter the Prod-Name:");
								String pn1 =s.nextLine();
								System.out.println("Enter the Prod-Price:");
							    float pp1 = Float.parseFloat(s.nextLine());
							    System.out.println("Enter the Prod-Qty:");
							    int pq1 = Integer.parseInt(s.nextLine());
							    ob.add(i4,new Product(pc1,pn1,pp1,pq1));
							    System.out.println("****Product-Details****");
							    ob.forEach((k)->
							    {
							    	System.out.println(k);
							    });
							}
							else
							{
								System.out.println("Inavlid index value...");
							}
							
						}
						break;
					case 7:
						if(ob.isEmpty())
						{
							System.out.println("List is empty");
						}
						else 
						{
							Collections.sort(ob);
							  System.out.println("****Product-Details****");
							    ob.forEach((k)->
							    {
							    	System.out.println(k);
							    });
							
						}
						break;
					case 8:
						if(ob.isEmpty())
						{
							System.out.println("List is empty");
						}
						else
						{
							System.out.println("Enter the code to perform edit operation");
							String pc5=s.nextLine();
							Iterator<Product> it2 = ob.iterator();
							while(it2.hasNext())
							{
								Product p = it2.next();
								if(pc5.equals(p.code))
								{
									System.out.println("Old price:"+p.price);
									System.out.println("Enter the new price:");
									float nprice=Float.parseFloat(s.nextLine());
									System.out.println("Existing Qty"+p.qty);
									System.out.println("Enter the new Qty:");
									int nqty=Integer.parseInt(s.nextLine());
									p.price=nprice;
									p.qty=p.qty+nqty;
									System.out.println("Product Updated");
									break;
								}
							}
							System.out.println("****Product-Details****");
						    ob.forEach((k)->
						    {
						    	System.out.println(k);
						    });
						}
						break;
					case 9:
						if(ob.isEmpty())
						{
							System.out.println("LIst is empty");
						}
						else
						{
							System.out.println("===Product Details====");
							Spliterator<Product> sp = ob.spliterator();
							sp.forEachRemaining((k)->
							{
								System.out.println(k);
							});
						}
						break;
					case 10:
						System.out.println("OPeration Stopped");
						System.exit(0);
						default:
							System.out.println("Invalid choice...");
						
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
