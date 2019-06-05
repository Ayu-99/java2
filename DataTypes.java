
public class DataTypes {

	public static void main(String[] args) {
		/*
		 *  Floating points
		 *  float  32 bits
		 *  double 64 bits
		 */
		byte discount = 20;
		long phone = 9915571177L;
		
		//byte data = 20L; ->error bcoz we are changing the defalut size 32 bits unnecceraly
		
		//float pi= 3.14F; // now it will be stored as 32 bits in constant pool
		double pi= 3.14;
		
		//char ch = 'A'; | 16 bits
		char ch ='\u20b9';
		System.out.println("ch is:"+ch);
		
		boolean isInternetOn = true; // 8 bits -> 1 bit(1/0)
		System.out.println("is internet on"+isInternetOn);
		
		//primitive types : work on values
		
		
		
	}

}
