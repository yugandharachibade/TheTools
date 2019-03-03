//this pass as argument to method

package homePractice;

public class AA {
 int data=100;
 void getdata(AA a)
 {
	  System.out.println("data:"+a.data);
 }
 void show()
 {
	 getdata(this);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA ab=new AA();
		ab.show();
	}

}
