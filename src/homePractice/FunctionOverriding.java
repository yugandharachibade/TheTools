package homePractice;

class Function
{
	int i;
	  void get1()
	{
		System.out.println("Inside function");
	}
}
class SubFunction extends Function
{
	   void get()
	{
		 
	    System.out.println("Inside Sub function"); 	

	}

}
public class FunctionOverriding {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		SubFunction sf=new SubFunction();
		Function f=new Function();
		f.get1();
		sf.get();
		sf.get1();
		Function f1=new SubFunction();
		f1.get1();
	
		
	}

}

