package homePractice;

public class SameNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]={10,40,10,40,20};
	int c=0;
	for(int i=0;i<=4;i++)
	{
	   for(int j=i+1;j<4;j++)
	   {
		   System.out.println();
		   if(a[i]==a[j])
		   {
			   c++;
		   }
	   }
	   if(c>0)
	   {
	   System.out.println(+a[i]+"is reprated :" +c);   
	   }
	   else
	   {
		   System.out.println(+a[i]+"is reprated :1");   
	   }
	}
	
		
	}

}
