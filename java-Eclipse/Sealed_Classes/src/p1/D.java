package p1;

public sealed class D extends A permits E
{
    public void mD()
    {
    	System.out.println("====mD()====");
    }
}
