package p1;

public class Fact 
{
  public int i,fact=1;
  public int getFact(int n)
  {
	  for(i=n;i>=1;i--)
	  {
		  fact=fact*i;
	  }
	  return fact;
  }
}
