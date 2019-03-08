package homePractice;

public class StringCharChange {
	String rev="";
	String sreversr(String a)
	{
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch>=65 && ch<=90)
			{
				//char h=a.charAt(i)+32;	
				
			}	
			
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCharChange sc=new StringCharChange();
		String s= sc.sreversr("aBcD");

		System.out.println("String after changing:"+s);
	}

}
