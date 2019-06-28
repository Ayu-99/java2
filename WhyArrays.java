
public class WhyArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int popLdh = 20012;
		int popJal = 55613;
		int popAsr = 34551;
		int popFrp = 43621;
		int popBad = 55632;
		
		int pop = popLdh + popJal + popAsr + popFrp  + popBad;
		System.out.println(pop);
					// 0    1      2     3      4
		int[] pops = {20012,55613,34551,43621,55632};
		
		//when we have a lot of data and we have homogeneous data.This is why we use arrays
		
		int count=0;
		for(int elem:pops)
		{
			count= count+elem;
		}
		System.out.println("population is:"+count);
		
		//write a  prog to give index of 43621
		
		int a=43621;
		for(int i=0;i<pops.length;i++){
			if(a==pops[i])
			{
				System.out.println(i); 
				break;
			}
			
		}
		
		//h.w find index of min and max value of array
		
		
		
		
	}

}
