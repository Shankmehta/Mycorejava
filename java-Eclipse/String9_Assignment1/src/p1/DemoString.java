package p1;
import java.util.*;
public class DemoString
{
        
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String");
			String str = s.nextLine();
			int len=str.length();
			int ac=0,vc=0,nc=0;
			for(int i=0;i<=len-1;i++)
			{
				char ch=str.charAt(i);
				int av=(int)ch;
				if((av>=65 && av<=90)||(av>=97 &&av<=122))
				{
					ac++;
					switch(ch)
					{
					case 'a':
					case 'A':vc++;
					break;
					case 'e':
					case 'E':vc++;	
					break;
					case 'i':
					case 'I':vc++;
					break;
					case 'o':
					case 'O':vc++;
					break;
					case 'u':
					case 'U':vc++;
					break;
					}
				}
				if(av>=48 && av<=57)
				{
					nc++;
				}
			}	
				System.out.println("COunt Of Alphabets="+ac);
				System.out.println("COunt Of Vowels="+vc);
				System.out.println("COunt Of consunant="+(ac-vc));
				System.out.println("COunt Of number="+nc);
			
		}
       
	  
	}
}
