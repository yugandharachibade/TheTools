package homePractice;

import java.util.Scanner;

public class StringCharConvert {
Scanner sc=new Scanner(System.in);
	 String cConvert()
	{	
		
		String s=sc.nextLine();
		StringBuffer newStr=new StringBuffer(s);
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i))) {  
	                //Convert it into upper case using toUpperCase() function  
	                newStr.setCharAt(i, Character.toUpperCase(s.charAt(i)));  
	            }  
	        else if(Character.isUpperCase(s.charAt(i))) {  
	                //Convert it into upper case using toLowerCase() function  
	                newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));  
	            }  
			
		}
		String n=new String(newStr);
		return n;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StringCharConvert sc=new StringCharConvert();
			String g=sc.cConvert();
			System.out.println(g);
			
		}

	}
