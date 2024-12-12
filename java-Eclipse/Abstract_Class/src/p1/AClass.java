package p1;

public abstract class AClass 
{
    public abstract void m1(int x);
    public void m2(int y)
    {
    	System.out.println("***concrete method***");
    	System.out.println("value of y="+y);
    }
}
