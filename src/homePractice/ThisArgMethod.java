package homePractice;

public class ThisArgMethod {
	
	void add(ThisArgMethod obj)
	{
		System.out.println("Methos invoke");
	}
	void add2()
	{
		add(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisArgMethod t=new ThisArgMethod();
		t.add2();
	}

}

