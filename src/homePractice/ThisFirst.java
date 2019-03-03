package homePractice;

public class ThisFirst 
{

	int a;
	int b;

	public void setdata(int a, int b)
	{
		
		//this.a=a;
		//this.b=b;
	}
	void showdata()
	{
		System.out.println("A:"+a+"\t B:"+b);
	}
	public static void main(String args[])
		{
		ThisFirst tf=new ThisFirst();
		tf.setdata(10, 20);
		tf.showdata();
	    }
}



	

