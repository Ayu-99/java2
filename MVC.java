
public class MVC {

	public static void main(String[] args) {
		
		//Single value container
		int num = 10;
		
		//Multi value container
		//Arrays are homogeneous
		int[] numbers = {10, 20, 30, 40, 50};
		
		//Read containers
		System.out.println(">>num is:"+num);
		System.out.println(">>numbers is:"+numbers); //hashcode
		
		//num contains value ->primitive
		//numbers contain hash code ->reference
		//numbers is a reference variable
		
		//update data in mvc
		numbers[1]=222;
		
		System.out.println(">>numbers[1] is:"+numbers[1]);
		System.out.println(">>numbers[2] is:"+numbers[2]);
		System.out.println("Size of numbers is:"+numbers.length);
		
		
		//read all
		/*for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
			
			
		}*/
		
		//enhanced for loop/for-each loop
		for(int kuchbhi : numbers){
			System.out.print(kuchbhi+" ");
		}
		
		
		
		
		
		
		
		
		

	}

}
