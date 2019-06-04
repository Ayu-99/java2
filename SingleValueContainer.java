
public class SingleValueContainer {

	public static void main(String[] args) {
		
		System.out.println("program started");
		
		//1.container creation statement
		int johnsAge = 20;
		//int is the type/class
		// johnsAge is the name of container
		//= is to write data in container
		// 20 is data or literal
		
		int jenniesAge=30;
		int jacksAge=20;

		//2.Container updation statements
		jacksAge=30;
		
		//3.copy operation
		int fionnasAge = jenniesAge;
		
		//4.read  Storage Container
		System.out.println("Johns Age is:"+johnsAge);
		System.out.println("Jennies Age is:"+jenniesAge);
		System.out.println("Jacks Age is:"+jacksAge);
		System.out.println("Fionnas Age is:"+fionnasAge);
		
		
		//System.out.print() ->> prints in same line		

		//5.delete operation
		//happens automatically:when main will be finished
		
		System.out.println("program finished");
	}

}
