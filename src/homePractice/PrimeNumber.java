package homePractice;

import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int  c = 0;
		boolean Flag=true;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter any number");
		a=sc.nextInt();
		/*for(int i=1;i<=a;i++)
		{	
		if((a%i)==0)
		{
			c++;
		}
		}
		
		if(c==2)
		{
			System.out.println(+a+" is Prime number");
		}
		else{
			System.out.println(+a+" is not Prime number");
		}*/
		
		for(int i=2;i<a;i++)
		{
		 if((a%i)==0)
		 {
			Flag=false;
			break;
		 }
				
		}
		if (Flag ==false) {
			System.out.println("Given number is not prime");	
		}
		else
		{
		System.out.println("Number is prime");
		}
	}

}
