
public class BreakAndContinue {

	public static void main(String[] args) {
		int myFloor = 5;
		for(int i=1;i<=10;i++){
			System.out.println(">> floor#"+i);
			if(i == myFloor){
				System.out.println("i am on my floor5 :)");
				break;
			}
		}
		System.out.println();
		
		for(int i=1;i<=10;i++){
			if(i<5){
				continue; // means skip code wriiten below...used to skips the statements and move to next iteration
			}
			System.out.println(">> i is:"+i);
		}

	}

}
//h.w>>> explore break and continue in nested loops
