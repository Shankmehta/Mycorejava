package p1;

public class Hosteller extends Student
{
    public double hostelFee=30000;
    
    public String displayDetails()
    {
           return "HostelFee="+hostelFee + "\nName="+name 
         		  + "\nStudentid="+studentId + "\nExamFee="+examFee;
    }
    public double payFee(int amt)
    {
   	 return amt-(hostelFee+examFee);
    }
}
