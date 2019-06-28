
public class ArraySyntaxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implicit statement
		int[] a1 = {10,20,30,40,50};
		//in this ,by default ,compiler will automatically add new int[] 
		int a2[] = {40,50,60,70,80};
		
		//explicit statement
		int[] a3 = new int[]{10,20,30,40,50};
		
		
		//new int [] is a request to jvm to create a new array in heap at run time
		//further,return a hashcode of created array in heap and store it in a3
		//new makes array in heap .it makes array at run time when program is running
		//primitives are created at the time of compile time
		
		

		//4.size
		int[] a4 = new int[10];
		//create an array with 10 integers having all as value 0
		 a4[10]=34;//here we are not getting an error because compiler does not know that array cannot store value at index 10,this will thorw an exception at run time
		 //because array is given memory at run time
		 
		for(int elem : a4)
		{
			System.out.println(elem +" ");
		}
		
		}
	}


