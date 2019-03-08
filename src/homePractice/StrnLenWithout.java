package homePractice;

import java.util.Scanner;

public class StrnLenWithout {

	
	static int len(String s)
	{	int count=0;
		char [] c=s.toCharArray();

		for(char t:c)
		{
			count++;
		}

		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=StrnLenWithout.len(sc.nextLine());
		System.out.println("Length:"+l);
		
		/*   Using Try Catch
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char [] c=s.toCharArray();
		for(int i=0;;i++)
		{
			try
			{
				System.out.print(c[i]+"\t");
				count++;
			}
			catch(Exception e){

				System.out.println("\nLength:"+count);
				break;

			}
		}*/

	}

}
