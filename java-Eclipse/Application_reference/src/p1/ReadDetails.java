package p1;
import java.util.Scanner;
public class ReadDetails 
{
    public Student sc;
    public ReadDetails(Student sc)
    {
    	this.sc=sc;
    }
    public void read(Scanner s)
    {
    
    	System.out.println("Enter the name");
    	sc.name= s.nextLine();
    	System.out.println("Enter the branch");
        sc.br= s.nextLine();
        System.out.println("Enter the rollno");
        sc.rollno = Integer.parseInt(s.nextLine());
        System.out.println("Enter the house number");
        sc.ad.hno= s.nextLine();
        System.out.println("Enter the street name");
        sc.ad.sname= s.nextLine();
        System.out.println("Enter the city");
        sc.ad.city= s.nextLine();
        System.out.println("Enter the state");
        sc.ad.state= s.nextLine();
        System.out.println("Enter the pincode");
        sc.ad.pincode= Integer.parseInt(s.nextLine());
        System.out.println("Enter the mailid");
        sc.ct.mid = s.nextLine();
        System.out.println("Enter the phone no");
        sc.ct.phno= s.nextLong();
        System.out.println("Enter the totalmarks");
        sc.rs.tmarks= s.nextInt();
        System.out.println("Enter the percentage");
        sc.rs.per= s.nextFloat();
        
        
    }
    
}
