package demo.com.CoreJava.collection;

public class StringDemo {
	
	
	public static void main(String[] args) {
		
		String s1 = "Pankaj";
		String s2 = "Pankaj";
		String s3 = new String("Pankaj");
		
		// equility based on reference, not cantent
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		
		s1 = s1 + "soni";
		
		System.out.println(s1==s2);//false
		
	}

}
