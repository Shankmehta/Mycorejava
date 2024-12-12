package p1;

public enum Books 
{
  Corejava(1200),AdvJava(1500),Spring(1700),Hibername(1800),WebServices(1200);
	public int price;
	private Books(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}
