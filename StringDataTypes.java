
public class StringDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
		//Interned Way
		//s1 and s2 are reference variables
		String s1 = "Hello";
		String s2 = "Hello";
		
		//Object Way
		String s3 = new String("Hello");
		String s4 = new String("HeLLo");
		
		if(s1==s2){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not");
		}
		if(s3==s4){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not");
		}
		
		if(s1==s3){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not");
		}
		
		System.out.println("s1 is:"+s1);
		System.out.println("s2 is:"+s2);
		System.out.println("s3 is:"+s3);
		System.out.println("s4 is:"+s4);
		
		
		System.out.println("s1.toString() is:"+s1.toString()); //give data rather than hashcode
		System.out.println("s2.toString() is:"+s1.toString());
		System.out.println("s3.toString() is:"+s1.toString());
		System.out.println("s4.toString() is:"+s1.toString());
		
		// toString is automatically executed so it does not print hashcode
		// rather it prints data
		
		if(s1.equals(s2)){ //compares data rather than hashcode .. ,mostly used to 
		// compare those string which are declared in object way
			System.out.println("equal");
			
		}
		else{
			System.out.println("not equal");
		}
		/*
		if(s3.equals(s4)){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}*/
		if(s1.equals(s3)){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}
		/*
		if(s3.compareTo(s4) == 0){
			System.out.println("compare to");
			
		}
		else{
			System.out.println("not compare");
		}*/
		
		if(s3.equalsIgnoreCase(s4)){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}
		if(s3.compareToIgnoreCase(s4) == 0){
			System.out.println("equal");
		}
		else{
			
			System.out.println("not equal");
		}
		
	}
	
	
	
 
}
