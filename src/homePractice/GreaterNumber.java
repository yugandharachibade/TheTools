package homePractice;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any 3 number:");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
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

