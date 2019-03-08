package homePractice;

public class ArrangeString {
	String ch;
    void arrang(String str)
    { 
    	String a[]=str.split(" ");
    	int j=a.length;
    	System.out.println(j);
    	for(int i=j-1;i>=0;i--)
    	{
    		System.out.println(a[i]);
    	}
    	
    	
    	//System.out.println(a[j-1]+" "+a[j-2]+" "+a[j-3]);
    	//return ch;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrangeString as=new ArrangeString();
		as.arrang("Yugandhara Sanjay Chibade");
		//System.out.println("String after Arrenge:"+s);
	}

}
