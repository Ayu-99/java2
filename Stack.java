import java.util.Scanner;

class Push extends Thread{
	int top;
	int max = 5;
	//int[] a = new int[5];
	Push(int[] arr){
		top=-1;
		 a = arr;
	}
	int[] a;
	 public void run(){
		for(int i=0;i<5;i++){
			if(top>=max-1){
				System.out.println("Overflow..");
				}else{
					int x;
					System.out.println("Enter value:");
					Scanner scan = new Scanner(System.in);
					x = scan.nextInt();
					a[++top] = x;
					System.out.println(x+" Entered in stack!!");
				}
		
			}
	}
}
class Pop extends Thread{
	int top;
	Pop(int[] arr){
		top = 4;
		 a = arr;
	}
	int[] a;
	 public void run(){
		 System.out.println("*******************");
		for(int i=0;i<5;i++){
	
			if(top<0){
				System.out.println("Underflow");
				
			}else{
				int x =a[top--];
				
				System.out.println(x+" Removed!!");
			}
		}
		System.out.println("********************");
	}		
}
public class Stack {
		
	public static void main(String[] args) {
		
		System.out.println("App started..");
		int[] a = new int[5];
		Push p1 = new Push(a);
		p1.start();
	
		try {     // we use synchronized instead of join because it makes more 
		// dynamic as join will have to be written after every start
			p1.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Pop p2 = new Pop(a);
		p2.start();
		
		
		try {     // we use synchronized instead of join because it makes more 
		// dynamic as join will have to be written after every start
			p2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("App Finished..");
	}

}
