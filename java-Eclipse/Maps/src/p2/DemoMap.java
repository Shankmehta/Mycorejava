package p2;
import java.util.*;
import p1.StudentValues;
import p1.StudentResult;
public class DemoMap {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		try(s;)
		{
			try
			{  
			 Map<String,StudentValues> ob =null;
			 String nm=null;
			
			 while(true)
			 {
				System.out.println("====Choice====");
				System.out.println("\t1.HashMap" 
						+ "\n\t2.LinkedHashMap"
						+ "\n\t3.TreeMap"
						+ "\n\t4.HashTable"
						+ "\n\t5.Exit");
				System.out.println("Enter the CHoice: ");
				switch(Integer.parseInt(s.nextLine()))
				{
				case 1:
					ob =new HashMap<String,StudentValues>();
					nm="HashMap";
					break;
				case 2:
					ob=new LinkedHashMap<String,StudentValues>();
					nm="LinkedHashMap";
					break;
				case 3:
					ob= new TreeMap<String,StudentValues>();
					nm="TreeMap";
					break;
				case 4:
					ob=new Hashtable<String,StudentValues>();
					nm="HashTable";
					break;
				case 5:
					System.out.println("Operation Stopped");
					System.exit(0);
					break;
				 default:
					 System.out.println("Invalid Choice");
					 continue;
				}
				System.out.println("Perform operation on "+nm);
				xyz:while(true)
				{
					System.out.println("===Select Operation===");
					System.out.println("\t1.put(K,V)"
							+ "\n\t2.remove(Object)"
							+ "\n\t3.get(Object)"
							+ "\n\t4.keySet()"
							+ "\n\t5.values()"
							+ "\n\t6.Exit");
					System.out.println("Enter the choice");
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						System.out.println("==Enter StudentDetails===");
						 System.out.println("Enter the Rollno");
						 String rno=s.nextLine();
						 System.out.println("Enter the StudName");
						 String name=s.nextLine();
						 System.out.println("Enter the StudBranch");
						 String br=s.nextLine();
						 
						 System.out.println("Enter the 6 Sub marks:");
						 int i=1,totm=0;
						 while(i<=6)
						 {
							 System.out.println("Enter the Sub"+i);
							 int sub =Integer.parseInt(s.nextLine());
							 totm=totm+sub;
							 i++;
						 }
						 float per =(float)totm/6;
						 String res=new StudentResult().generate(per);
						 
						 ob.put(new String(rno),new StudentValues(name,br,totm,per,res));
						 System.out.println("====Student Details====");
						 ob.forEach((p,q)->
						 {
							System.out.println(p+ "\t"+q); 
						 });
						break;
					case 2:
						if(ob.isEmpty())
						{
							System.out.println("Map is empty");
						}
						else
						{
							System.out.println("Enter the rno to remove Detials");
							String rno1=s.nextLine();
							if(ob.containsKey(rno1))
							{
								ob.remove(rno1);
							
							System.out.println("====Student Details====");
							 ob.forEach((p,q)->
							 {
								System.out.println(p+ "\t"+q); 
							 });
							}
							 else
							 {
								 System.out.println("Rollno not found");
							 }
							
						}
						break;
					case 3:
						if(ob.isEmpty())
						{
							System.out.println("MAp is empty");
						}
						else
						{
							System.out.println("Enter the rollno to get details");
						     String rno2=s.nextLine();
						     if(ob.containsKey(rno2))
						     {
						    	 StudentValues sv = ob.get(rno2);
						    	 System.out.println(sv.toString());
						     }
						     else
						     {
						    	 System.out.println("Rollno not found");
						     }
						}
						 break;
					case 4:
						if(ob.isEmpty())
						{
						 System.out.println("Map is empty");
						}
						else
						{
							Set<String> ks = ob.keySet();
							System.out.println("****Keys****");
							ks.forEach((k)->System.out.println(k));
						}
						break;
					case 5:
						if(ob.isEmpty())
						{
							 System.out.println("Map is empty");
						}
						else
						{
							Collection<StudentValues> vs=ob.values();
							System.out.println("*****values()****");
							vs.forEach((k)->System.out.println(k));
						}
						break;
					case 6:
					System.out.println("operation stopped on "+nm);
					break xyz;
					
					default:
						System.out.println("Invalid choice");
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
