package homePractice;

public class PalendromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer str=new StringBuffer("ABA");
		//StringBuffer r=str.reverse();
		String s="asa";
		String s2="";
		
		//String s1=new String(str);
		//String s2=new String(r);
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
		
		if(s.equals(s2))
		{
			System.out.println("Yes Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
		
		
	}
}
