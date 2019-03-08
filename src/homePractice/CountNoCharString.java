package homePractice;

public class CountNoCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String str="India";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='a')
			{
				count=count+1;
			}
		}
		System.out.println("A repeated :"+count+" times");
	}

}
