package homePractice;

 public class FunctionOverloading {

	 int total;
		long add(long a,long b)
		{
			long total=a+b;
			return total;
		}
		float add(int a,float b)
		{
			float total=a+b;
			return total;
		}
		int add(int a,int b,int c)
		{
			total=a+b+c;
			return total;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading a=new FunctionOverloading();
		long aa=a.add(10l,20l);
		System.out.println("aa="+aa);
		aa=a.add(10, 11, 13);
		System.out.println("aa="+aa);
	    float ab=a.add(11, 11.3f);
	    System.out.println("ab="+ab);
		
	}

}
