package homePractice;

import java.util.Scanner;

public class GreaterNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc;
		sc= new Scanner(System.in);
		System.out.println("Enter any 3 number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if (a>b && a>c) {
			System.out.println(+a+" is greater number");}
		else if(b>c && b>a)
		{
			System.out.println(+b+" is greater number");
		}
		else{
			System.out.println(+c+" is greater number");
		}	
		}

	}

