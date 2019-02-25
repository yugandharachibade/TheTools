package homePractice;

public class patteren3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=6,r,s,str;
		for(r=1;r<=row;r++)
		{
			for(s=1;s<=(row-r);s++)
			{
				System.out.print(" ");
			}
			for(str=1;str<=(r*2)-1;str++)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
		for(r=2;r<=row;r++)
		{
			for(s=1;s<=r-1;s++)
			{
				System.out.print(" ");
			}
			for(str=1;str<=((row-r)*2+1);str++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
