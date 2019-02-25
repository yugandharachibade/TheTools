package homePractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int a;
	 int temp=1;
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter any number");
	 a=s.nextInt();
	  for(int i=1; i<=a;i++)
	  {
		temp=temp*i;
		 
	  }
	  System.out.println("Factorial:" +temp);

	}

}
