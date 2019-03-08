package homePractice;

import java.util.Scanner;

class RBI
{
	Scanner sc=new Scanner(System.in);
	int rate;
	void getRI()
	{
		System.out.println("Enter RBI Rate of interest :");
		rate=sc.nextInt();
	}
	 void show()
	{
		 
		System.out.println("Rate of Interest:"+rate);
	}
}
class SBI extends RBI
{
	void getRI()
	{ 
		super.getRI();
		rate=rate+2;
		System.out.println("SBI Rate of Interest: "+rate);
	}
}
class BOI extends RBI{
	void getRI()
	{
		rate=11;
		System.out.println("BOI Rate of Interest: "+rate);
	}
}
public class FunctionOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		s.getRI();
		//s.show();
		BOI b=new BOI();
		b.getRI();
		//b.show();
	}

}
