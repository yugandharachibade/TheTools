//This pass As Argument to constuctor

package homePractice;

public class A {
	int data=10;
	A()
	{
		B b=new B(this);
		b.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();

	}

}

class B{
	A a;
	B(A obj)
	{
		a=obj;
	}
	void display()
	{
		System.out.println("Data:"+a.data);
	}
}
