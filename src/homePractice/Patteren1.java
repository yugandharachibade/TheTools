package homePractice;

public class Patteren1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int row=5,r,str;
     /*for(r=1;r<=row;r++)
	{
    	 for(str=1;str<=r;str++)
    	 {
    		 System.out.print("*");
    	 }
        System.out.println("");
	}
     
     output 
     *
     **
     ***
     ****
     *****   */
     
     for(r=1;r<=row; r++)
     {
    	 for(str=1;str<=(row-r)+1;str++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println("");
     }
	}

}
