
public class ReferenceCopy {

	public static void main(String[] args) {
		int num = 10;
		int[] numbers={10,20,30,40,50};
		
		int num1 = num;// value copy
		int[] numbers1 = numbers;
		//reference copy i.e hashcode is copied
		//here reference is 2 array is 1
		System.out.println(">>num is:"+num);
		System.out.println(">>num1 is:"+num1);
		System.out.println(">>numbers is:"+numbers);
		System.out.println(">>numbers1 is:"+numbers1);
		
		numbers1[3] = 111;
		numbers1[1] = 555;
		
		for(int elem:numbers)
		{
			System.out.println(elem+" ");
		}
		
		
		

	}

}
