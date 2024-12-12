package p1;
public class DisplayDetails
{
       public Student sc;
       public DisplayDetails(Student sc)
       {
    	   this.sc=sc;
       }
       public void getDisplay()
       {
    	   sc.getStudent();
    	   sc.ad.getAddress();
    	   sc.ct.getContact();
    	   sc.rs.getResult();
       }
}
