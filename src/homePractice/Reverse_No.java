package homePractice;

import java.util.Scanner;

public class Reverse_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6};
		int a[]=new int[10];
		
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println();
		System.out.println("Array Reverse:");
		for(i=(arr.length-1);i>=0;i--)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println();
		System.out.println("Enter number for array");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<=9;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Element of array:");
		for(i=0;i<=9;i++)
		{
			System.out.println("\t"+a[i]);
		}
		System.out.println("Reverse Element of array:");
		for(i=9;i>=0;i--)
		{
			System.out.print("\t"+a[i]);
		}
	}

}
