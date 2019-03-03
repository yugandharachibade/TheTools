package homePractice;

import java.util.Scanner;

public class Aemstron_No {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,count=0,temp;
		System.out.println("Enter no :");
		sc = new Scanner(System.in);
		n=sc.nextInt();
		 temp=n;
      while(n>0)
      {
    	  rem=n%10;
    	  n=n/10;
    	  count=count+(rem*rem*rem);
      }
      if(count==temp)
      {
    	  System.out.println("Given number is armstrong");
      }
      else{
    	  System.out.println("Number is not armstrong");
      }
	}

}
