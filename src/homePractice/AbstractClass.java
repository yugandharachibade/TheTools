package homePractice;

abstract class RBIB
{
	 abstract int getRI();
    	synchronized void show()
    	{
    		System.out.println("Inside Show Method");
    	}
    	RBIB()
    	{
    		System.out.println("RBI created");
    	}
    	 static void b()
    	{
    		 System.out.println("Inside Static method");
    	}
}
 
class SBIB extends RBIB
{
	int getRI()
	{
		return 7;
	}
}

class BOIB extends RBIB
{
	int getRI()
	{
		return 8;
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		
		RBIB r=new SBIB();
		r.show();
		System.out.println("SBI Rate of Interest: "+r.getRI()+"%");
		RBIB.b();
		

		System.out.println();
		RBIB r1=new BOIB();
		System.out.println("BOI Rate of Interest: "+r1.getRI()+"%");
		r1.show();

	}
	

}
