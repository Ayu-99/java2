
public class ValueVsRef {
	
	static void squareOfNum(int num) //passing value(copying the value)
	{
		num = num*num;
		System.out.println("num is:"+num);
	}
	static void squareOfNumbers(int [] nums) //passing value(copying the value)
	{
		//num = num*num;
		System.out.println("num is:"+nums);
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=nums[i]*nums[i];
			System.out.print(nums[i]+" ");
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		squareOfNum(number);//only if main and function are in same class and both are static
		
		System.out.println(">>number is:"+number);
		int []arr = {1,2,3,4,5};
		System.out.println("arr is:"+arr);
		squareOfNumbers(arr);
		System.out.println();
		for(int elem : arr){
			System.out.print(elem+" ");
			
		}
		
				
		

	}

}
