package p1;
public class Account
{
  public  long accno;
  public  String cname,acctype;
  public  float bal;
  
  public void getAccount()
  {
	  System.out.println("****Account Detail****");
	  System.out.println("Accountno="+accno);
	  System.out.println("Customer name="+cname);
	  System.out.println("balance="+bal);
	  System.out.println("Acctype="+acctype);
  }
}
