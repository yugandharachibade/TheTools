package homePractice;

public class CountStringSpace {
		 int count(String str)
 	{	int c=0;
			for(int i=0;i<str.length();i++)
			{
				char ch;
				ch=str.charAt(i);
				if(ch==' ')
				{
					c++;
				}
				
			}
			
	return c;
			 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountStringSpace e=new CountStringSpace();
		 int a=e.count("I am yugandhara");
		 
		 System.out.println("Spaces in give String:"+a);
		 
		
		
	}

}
