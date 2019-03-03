package homePractice;

public class ThisToCallConstructor {
	
	ThisToCallConstructor()
	{
		 this(10);
		//this(10,20);
		System.out.println("inside 0 Args constructor");
		
	}
	ThisToCallConstructor(int a)
	{
		this(10,20);
		System.out.println("inside 1 Args constructor");
	}
	ThisToCallConstructor(int a, int b)
	{
		
		System.out.println("inside 2 Args constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisToCallConstructor tc=new ThisToCallConstructor();
		System.out.println("All Constructor Executed!!!");
	}

}
