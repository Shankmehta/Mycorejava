package p1;

public class Employee 
{ 
	public int id;
	public String name,desg;
	
	 public Address ad = new Address();
	 public Contact ct = new Contact();
	
	public void getEmployee()
	{
		System.out.println("Id="+id);
		System.out.println("Name="+name);
		System.out.println("Designation="+desg);	
	}
	

}
