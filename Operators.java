
public class Operators {

	public static void main(String[] args) {
		int x =12 ; //1 1 0 0
		int y = 3;
		//int z = x >> y; //1 1 0 0>>3.... 0 0 0 1
		//System.out.println(">> z is:"+z);
		
		
		int z = x<<y;
		System.out.println(z);
		
		int actualData = z >> y;
		System.out.println(">> z is:"+actualData);
		
		x=-13;
		y=2;
		z = x << y;
		System.out.println(">> z is:"+z);
		
		x = 12;
		y = 8;
		int z1 = x & y;
		System.out.println(">> z is:"+z1);
		
		
		int z3 = x ^ y;
		System.out.println(">> z is:"+z3);
		
		
		
		

	}

}
