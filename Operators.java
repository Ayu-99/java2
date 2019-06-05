
public class Operators {

	public static void main(String[] args) {
		// Controller -> Logic to solve praxesoblem
		// 1.Operators | 2. Conditions | 3.Loops

		// arithmetic operators: +,-,*,/,%
		int dish1 = 200;
		int dish2 = 300;
		int bill = dish1 + dish2;
		System.out.println(" your bill amount is:"+bill);
		
		int taxes = bill*5/100;
		System.out.println(" taxes is:"+taxes);
		
		int total = bill +taxes;
		System.out.println(" please pay:"+total);
		
		
		int data1 = total / 5;
		System.out.println(data1);
		int data2 = total % 5;
		System.out.println(data2);
		
		
		// assignment operators: =,+=,-=,*=,/=,%=
		
		int num1=10;
		num1 = num1 +5;//num1 += 5;
		num1 %= 3;
		System.out.println(num1);
		
		// conditional operators(if/else) : >,<,>=,<=,==, !=
	   int rank1=7;
	   int rank2=10;
		System.out.println(" is rank1>rank2?"+(rank1 > rank2));
		
		// increment and decrement operators
		
		int x= 10;
		x++; // x=x+1
		++x; // x=x+1
		x++;
		--x;
		System.out.println(" x in:"+x);
		
		int y=x++;
		System.out.println(" x is:"+x+" and y is:"+y);
		
		int z=++x;
		System.out.println(" x is:"+x+"and y is:"+z);
		
		//h.w-->>> Associativity and precedence of operators
		
		// logical operators
		int physics = 90;
		int maths = 95;
		int chemistry = 70;
		
		System.out.println(" can student be an engineer:"+(maths > physics && maths > chemistry));
		
	
	
	
	
	
	}

}
