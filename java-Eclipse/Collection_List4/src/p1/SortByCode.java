package p1;
import java.util.*;
@SuppressWarnings("rawtypes")
public class SortByCode implements Comparator
{
  public int compare(Object o1,Object o2)
  {
	  BookDetails b1=(BookDetails)o1;
	  BookDetails b2=(BookDetails)o2;
	  int z=b1.code.compareTo(b2.code);
	  if(z==0)return 0;
	  else if(z>0)return 1;
	  else return -1;
  }
}
