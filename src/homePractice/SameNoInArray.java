package homePractice;

public class SameNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]={10,40,40,20,40};
	int c=0;
	for(int i=0;i<a.length;i++)
	{
	   for(int j=0;j<a.length;j++)
	   {
		   if(a[i]==a[j])
		   {
			   c=c+1;
		   }
	   }
	
	   if(c>0)
	   {
	   System.out.println(+a[i]+"is reprated :" +c+" times");  
	   
	   }
	
	   c=0;
	}
	
	}	
	}


