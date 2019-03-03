package homePractice;

public class ThisArgConstructor {
	void m()
	{
		TestA ta=new TestA(this);
	}
	public static void main(String args[])
	{
		ThisArgConstructor tc= new ThisArgConstructor();
		tc.m();
	}
}
  class TestA
{
	TestA(ThisArgConstructor t)
	{
		System.out.println("In side TestA");
		
	}
}