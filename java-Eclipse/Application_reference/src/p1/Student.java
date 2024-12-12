package p1;
public class Student
{
    public String name,br;
    public int rollno;
    
    Address ad = new Address();
    Contact ct = new Contact();
    Result rs = new Result();
    
    public void getStudent()
    {
    	System.out.println("****Student****");
    	System.out.println("Name="+name);
    	System.out.println("branch="+br);
    	System.out.println("Rollno="+rollno);
    }
}
