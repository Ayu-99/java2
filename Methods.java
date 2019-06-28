/* method or functions or routine
 * 
 * in our program we can create functions to solve problems:
 * Syntax- Ack FunctionName(inputs){
 *	definition 
 * }
 * void ->no ack 
 * void payMoney(int amount,int uid){
 *   //..
 * }
 * boolean payMoney(int amount, int uid){
 * 
 * 	//..
 * return true
 * }
 * 
 * 
 * In a prog ,we have small logics which do a desire task and this task is to be done repeteadly
 * so we can create a method to solve this problem
 * 
 * with methods we achieve Modularization.
 * 
 * 
 */

public class Methods {
	
	//creation of functions
	
	//non-static
	/*void addNumbers(int num1 ,int num2){
		int sum= num1+num2;
		System.out.println("sum is:"+sum);
	}
	//static 
	static void addNumbersAgain(int num1 , int num2){
		int sum=num1+num2;
		System.out.println("sum is:"+sum);
	}*/
	
	//whenever we execute our program main is executed
	//whatever we write in main is executed in sequence
	
	//non-static
	int addNumbers(int num1 ,int num2){
		int sum= num1+num2;
		System.out.println("sum is:"+sum);
		return 1;
	}
	//static 
	static int  addNumbersAgain(int num1 , int num2){
		int sum=num1+num2;
		System.out.println("sum is:"+sum);
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int num1 =12;
		int num2 = 20;
		int sum = num1 + num2;
		System.out.println("sum is:"+sum);
		
		
		int num11 = 10;
		int num22 = 20;
		int sum1 = num11 +num22;
		System.out.println("sum is:"+sum1);
		*/
		
		//1.execution/calling of non-static method
		//we need object of class
		Methods mRef  = new Methods();
		int ack=mRef.addNumbers(5,4);
		System.out.println("ack is:"+ack);
		
		if(ack==1)
		{
			System.out.println("sum operation completed");
		}
		System.out.println();
		mRef.addNumbers(6,4);
		mRef.addNumbers(4, 7);
		
		System.out.println();
		
		//2.execution of static members
		//we do not need object of class
		
		Methods.addNumbersAgain(5, 5);
		Methods.addNumbersAgain(5, 6);
		
		

	}

}
