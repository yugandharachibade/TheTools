package homePractice;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	        String s1="java";//creating string by java string literal  
	        char ch[]={'s','t','r','i','n','g','s'};  
	        String s2=new String(ch);//converting char array to string  
	        String s3=new String("yuga");//creating java string by new keyword  
	        String s6=new String(s3);
	        System.out.println(s1);  
	        System.out.println(s2);  
	        System.out.println(s3);  
	        
	        String s="yuga";
	        String n="Chibade";
	        String m="yuga";
	        
	        String a=s.concat(n);
	        System.out.println("New String:"+a);
	        
	        System.out.println(s.equals(m));
	        System.out.println(s.equals(n));
	        
	        System.out.println(s==m);
	        System.out.println(s==s6);
	        
	        System.out.println(s.compareTo(s3));
	        System.out.println(s.compareTo(a));
	        
	        String b=s+" chibade";
	        System.out.println(b);
	        
	       String g=b.substring(2);
	       System.out.println(g);
	        
	       g=b.substring(2,5);
	       System.out.println(g);
	       
	       System.out.println(b.toUpperCase());

	       System.out.println(b.toLowerCase());
	       
	       //System.out.println(b.);
	      System.out.println(b.trim());
	       
	       
	       System.out.println(s.startsWith("y"));
	       System.out.println(s.endsWith("aa"));
	       
	       
	      System.out.println(b.charAt(5));
	      System.out.println(b.length());
	      
	      int i=10;
	      String s5=String.valueOf(10);
	      System.out.println(10+s5+10);
	      
	      System.out.println(b);
	      String rep=b.replace("yuga", "Prajakta");
	      System.out.println(rep	);
	      
	      b.replace("yuga", "Prajakta");
	      System.out.println(b);
	      
	    }
	}


