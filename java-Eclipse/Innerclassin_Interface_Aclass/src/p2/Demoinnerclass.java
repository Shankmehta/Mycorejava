package p2;
import p1.*;
public class Demoinnerclass {

	public static void main(String[] args)
	{
		Itest.Subclass ob = new Itest.Subclass();
          ob.m(10);
          Aclass.Subclass1 ob1 = new Aclass.Subclass1();
          ob1.m1(20);
          Aclass d = new Aclass()
        		  {
        	         //emptybody
        		  };
          Aclass.Subclass2 ob2 = d.new Subclass2();
          ob2.m2(30);
	}    

}
