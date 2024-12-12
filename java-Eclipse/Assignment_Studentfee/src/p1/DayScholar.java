package p1;

public class DayScholar extends Student 
{
   public double transportFee =25000;
   
   
   public String displayDetails()
   {
          return "TransportFee="+transportFee + "\nName="+name 
        		  + "\nStudentid="+studentId + "\nExamFee="+examFee;
   }
   public double payFee(int amt)
   {
  	 return amt-(transportFee+examFee);
   }
}
