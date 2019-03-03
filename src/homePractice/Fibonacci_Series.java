package homePractice;

import java.util.Scanner;

public class Fibonacci_Series
{

	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no");
      int num=sc.nextInt();
      int f1,f2=0,f3=1;
      for(int i=0;i<=num;i++)
      {
    	  System.out.print(" " +f3);
    		  f1=f2;
    		  f2=f3;
    		  f3=f1+f2;
	}
	}
}
