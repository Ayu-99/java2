import java.util.Scanner;

// Loops : 1.while 2.while 3.do while
public class Loops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //System.in performs read from console to read 
		
		System.out.println("enter a number:"); // System.out performs write on console
		int number = scanner.nextInt(); //read an integer which user enters from console
		
		System.out.println(">> you entered :"+number);
		scanner.close();
		
		//int i=1;
		//System.out.println(">>"+number+" "+i+" 's are"+(number*i));
		
		
		int i=1;
		while(i <= 10)
		{
			System.out.println(">>"+number+" "+i+" 's are"+(number*i));
		}

	}

}
