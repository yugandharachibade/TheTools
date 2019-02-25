package homePractice;

import java.util.Scanner;

public abstract class GreaterNoArray {

	public static void main(String[] args) {
		int a[]=new int[5],temp=0;
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 no for array");
		for(i=0;i<5;i++)
		{
			
			a[i]=sc.nextInt();	
		}
      for(i=0;i<5;i++)
       {
    	   if(a[i]>temp)
    	   {
    		   temp=a[i];
    	   }
       }
       System.out.println("Greater No is:"+temp);
       
       for(i=0;i<5;i++)
       {
    	   for(j=i+1;j<5;j++)
    	   {
    		   if(a[i]<a[j])
    		   {
    			   temp=a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    	       }
    	   }
    	}
    	   
       System.out.println("Smallest No is:"+ a[0]);
       System.out.println("Sorted decending order array:");
       		for(i=0;i<5;i++)
       			{
       				System.out.println(+a[i]);
       			}
	}
	}

