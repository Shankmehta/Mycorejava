package p1;
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
				LinkedList<String> ob = new LinkedList<String>();
				LinkedList<String> vob = new LinkedList<String>();
				LinkedList<String> cob = new LinkedList<String>();
				
				System.out.println("Enter the number of string");
				int n =Integer.parseInt(s.nextLine());
				System.out.println("Enter the "+n+"Strings");
				for(int i=1;i<=n;i++)
				{
					ob.add(new String(s.nextLine()));
				}
				System.out.println("====LIst of Strings==");
				System.out.println(ob.toString());
				System.out.println("==== vowels====COnsunant====");
				ob.forEach((k)->
				{
					char ch = k.charAt(0);
					int av = (int)ch;
					if((av>=65&&av<=90)||(av>=97&&av<=122));
					{
						switch(ch)
						{
						case 'a':
						case 'A':
							vob.add(k);
							break;
						case 'e':
						case 'E':
							vob.add(k);
							break;
						case 'i':
						case 'I':
							vob.add(k);
							break;
						case 'o':
						case 'O':
							vob.add(k);
							break;
						case 'u':
						case 'U':
							vob.add(k);
							break;
						default:
							cob.add(k);
						
						}
					}
					System.out.println(k);
				});
				System.out.println("Vowels:"+vob.toString());
				System.out.println("COnsunants:"+cob.toString());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
