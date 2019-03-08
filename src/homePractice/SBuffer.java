package homePractice;

public class SBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" java");
		System.out.println(sb);
		sb.append(10);
		System.out.println(sb);
		sb.append(false);
		
		sb.insert(1, "java");
		System.out.println(sb);
		
		sb.insert(3, "yuga");
		System.out.println(sb);
		
		sb.replace(1, 18, "yuga");
		System.out.println(sb);
		
		sb.replace(0,5,"yugandhara Chibade");
		System.out.println(sb);
		sb.delete(10, 18);
		System.out.println(sb);
		sb.delete(10, 17);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		int i=sb.capacity();
		System.out.println(i);
		
	 System.out.println(sb.charAt(5));
	 StringBuffer sb2=new StringBuffer("India is my country");
	 int j=sb2.capacity();
	 System.out.println(j);
	 
	 int v=sb.length();
	 System.out.println(v);
	 
	 System.out.println(sb2.length());
	 String ss=sb.substring(4);
	 System.out.println(ss);
	 
	 sb.append(" chibade");
	 System.out.println(sb);
	 
	 sb.trimToSize();
	 System.out.println(sb);
	 
	ss=sb.substring(0, 4);
	System.out.println(ss);
	 
	 
	  
	}

	
}
