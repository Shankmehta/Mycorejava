package p1;

public class StudentValues extends Object
{
   public String name ,branch,result;
   public int totmarks;
   public float per;
   
   public StudentValues(String name,String branch,int totmarks,float per,String result)
   {
	   this.name=name;
	   this.branch=branch;
	   this.result=result;
	   this.totmarks=totmarks;
	   this.per=per;
   }
   public String toString()
   {
	   return name+"\t"+branch+"\t"+result+"\t"+"\t"+totmarks+
			   "\t"+per;
   }
}
