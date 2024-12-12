package p1;
public class CreateAccount 
{
   public Account ac;
   public CreateAccount(Account ac)
   {
	   this.ac=ac;
   }
   public void create(long accno,String cname,float bal,String acctype)
   {
	   ac.accno=accno;
	   ac.cname=cname;
	   ac.bal=bal;
	   ac.acctype=acctype;
   }
}
