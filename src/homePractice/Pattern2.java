package homePractice;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int row=5;
    int r,s,str;
    /*for( r=1; r<=row; r++ )
    {
    	for (s = 1; s <=row-r; s++) {
    		System.out.print(" ");
         }
    	for(str=1;str<=r;str++)
    	{
    		System.out.print("*");
    	}
    	
		System.out.println("");	
	}  output-     *
   **
  ***
 ****
*****    */
    
    for(r=1;r<=row;r++)
    {
    	for(s=1;s<=(r-1);s++)
    	{
    		System.out.print(" ");
    	}
    	for(str=(row-r)+1;str>=1;str--)
    	{
    		System.out.print(str);
    	}
    	System.out.println();
    }
        
  }
	
}


