package p1;
import java.util.*;
public class DemoSet
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				LinkedHashSet<Integer> ob = new LinkedHashSet<Integer>();
				System.out.println("Enter the String");
				String str = s.nextLine();
				int len=str.length();
				for(int i=0;i<=len-1;i++)
				{
					int k =(int)str.charAt(i);
					ob.add(new Integer(k));
				}
				Iterator<Integer> it = ob.iterator();
				while(it.hasNext())
				{
					Integer i = (Integer)it.next();
					char ch = (char)i.intValue();
					System.out.print(ch);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
