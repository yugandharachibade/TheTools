package homePractice;

class Base
{
	 void getBase()
	{
		System.out.println("Inside A");
	}
	 /*void get()
		{
			System.out.println("Inside A get");
	 }*/
}
class Child  extends Base
{
	 void get()
	{
		System.out.println("Inside B");
	}
}
public class test1 {

	public static void main(String[] args) {
		
		Base aa=new Child();
	    aa.getBase();
		//aa.get();
		Child c=(Child)aa;
		c.get();
		c.getBase();
		/*Child c=new Child();
		c.get();
		c.getBase();*/
	}

}
