
public class NDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = {      //we can represent matrix with array of arrays ....array of arrays is not a matrix
				{10,20,30}, //0
				{10,20},//1
				{10,20,30,40}//2
		};
		System.out.println("arr[0] is:"+arr[0]+"and length is:"+arr[0].length);
		
		for(int i=0;i<arr.length;i++){
			System.out.println("arr["+i+"]="+arr[i]+"and length is:"+arr[i].length);
			//arr->reference variable which refer to an array
			//that array contain references to other arrays having values
		}
		int[][][] arr2 = {
				{
					{10,20,30},
					{10,20}
				},
				{
					{10,20,40},
					{10,50}
					}
				};
	}
		System.out.println("array is:"+array+"and length is:"+array.length);
	
	}


//rest prog at github






 