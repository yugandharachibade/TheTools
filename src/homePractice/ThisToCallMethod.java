package homePractice;

public class ThisToCallMethod {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.show();
	}

}
class Test
{	
	int a;
	int b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;		
	}
	void show()
	{
		this.getdata(10, 20);
		System.out.println("A:="+a+"  B:="+b);
	}
	
	
}
