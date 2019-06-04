
public class DataTypes {

	public static void main(String[] args) {
		/*
		 * By default , each number is represented in 32 bits
		 * Number:
		 * byte  8bits
		 * short 16 bits
		 * int   32 bits
		 * long  64 bits
		 *
		 * byte :8 bits->2pow8
		 * 256/2-> -128 to 0 to 127
		 */
		
		byte number = -128;
		System.out.println("number is: "+number);
		
		long phoneNumber =  7837822586L;
		
		int johnsPhoneNumber = (int)phoneNumber;// DownCasting
		
		//in downcasting we loose our data
		
		System.out.println(johnsPhoneNumber); 
		
		long age = number; // UpCasting
		System.out.println(age);
		
		byte jacksAge= (byte)130;
		System.out.println("Jacks Age is:" +jacksAge);
		
		
		
		

	}

}
