package homePractice;

public class ThisReturn {

	ThisReturn m()
	{
		 System.out.println("Inside method M");
   		return this;

	}
	
	void m2()
	{
		System.out.println("m2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReturn tc=new ThisReturn();
		tc.m().m2();
		
	}

}
