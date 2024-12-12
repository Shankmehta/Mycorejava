package p1;

public sealed class A permits B,C,D
{
	public void mA()
	{
		System.out.println("====mA()====");
	}

}

