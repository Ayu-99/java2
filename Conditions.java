
public class Conditions {

	public static void main(String[] args) {
		
		int totalBill = 1000;
		
		if(totalBill > 500){
			System.out.println(" flat 40% discount");
		}else{
		    System.out.println(" sorry no discount");
			
		}
		boolean isInternetOn = true;
		boolean isGPSOn = true;
		
		if(isInternetOn)
		{
			if(isGPSOn)
			{
				
			System.out.println(" you can browse google maps and navigate goole maps");
			}
			
			else
			{
			System.out.println(" please connect to gps and try again");
			}
		}
		else
		{
			System.out.println(" please connect to internet and try again");
		}

	}

}
