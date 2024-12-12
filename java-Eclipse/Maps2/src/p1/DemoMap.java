package p1;
import java.util.*;
import java.util.function.*;
public class DemoMap {

	public static void main(String[] args) 
	{
	  LinkedHashMap<String,Float> ob = new LinkedHashMap<String,Float>();
	  ob.put(new String("CJ"), 123.45F);
	  ob.put(new String("AJ"), 120.05F);
	  ob.put(new String("SP"), 103.15F);
	  ob.put(new String("HB"), 201.89F);
	  ob.put(new String("PY"), 156.03F);
	  
	  System.out.println("=====Display using EntrySet===");
	  for(Map.Entry<String,Float> e : ob.entrySet())
	  {
		  System.out.println(e.getKey()+"\t"+e.getValue());
	  }
	  System.out.println("===BookDetails(price<150)===");
	   BiPredicate<String,Float> bp = (p,q)->
	   {
		   if(q<150) return true;
		   else return false;
	   };
	   ob.forEach((x,y)->
	   {
		   if(bp.test(x,y))
		   {
			 System.out.println(x +"\t"+y);  
		   }
	   });
	   System.out.println("***BiFunctional<T,U,R>**");
	   BiFunction<String,Float,Float> fn =(p,q)->
	   {
		  return q+50; 
	   };
	   ob.forEach((x,y)->
	   {
		   System.out.println(fn.apply(x, y));
	   });
	   System.out.println("***replaceAll()***");
	   ob.replaceAll(fn);
	   ob.forEach((x,y)->
	   {
		   System.out.println(x+"\t"+y);
	   });
	   System.out.println("****Immutable map<k,v>***");
	   Map<String,Float> m=Map.of("CJ",123.45F,"SF",675.98F,"Aj",887.43F);
	   m.forEach((x,y)->
	   {
		  System.out.println(x+"\t"+y);  
	   });
	}

}
