package firstPackage;

public class HelloWorld {

	public static void main(String[] args) {
		int i=0;
		int a[]={10,40,30,20};
		
for (int j = 0; j < a.length; j++) {
if(a[j]>i)
{
	i=a[j];
}
	}
System.out.println("Largest no is:"+i);

}
}
