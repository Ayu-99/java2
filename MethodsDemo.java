
public class MethodsDemo {

	/*static void applyPromoCode(int code,double amount){
		
		if(code==1){
			double discount = (50.0/100.0)*amount;
			amount = amount - discount;
			System.out.println(">>please pay:"+amount);
			
		}
		else if(code==2){
			double discount = (30.0/100.0)*amount;
			amount = amount - discount;
			System.out.println(">>please pay:"+amount);
			
		}
		else if(code==3)
		{
			double discount = (20.0/100.0)*amount;
			amount = amount - discount;
			System.out.println(">>please pay:"+amount);
		}
		else{
			System.out.println("no discount");
		}
			
		
	}*/
	
static double getDiscountAfterPromoCode(int code,double amount){
		double discount=0.0;
		if(code==1){
			 discount = (50.0/100.0)*amount;
			//amount = amount - discount;
		//	System.out.println(">>please pay:"+amount);
			
		}
		else if(code==2){
			 discount = (30.0/100.0)*amount;
		//	amount = amount - discount;
		//	System.out.println(">>please pay:"+amount);
			
		}
		else if(code==3)
		{
			 discount = (20.0/100.0)*amount;
			//amount = amount - discount;
		//	System.out.println(">>please pay:"+amount);
		}
		else{
			System.out.println("no discount");
		}
			
		return discount;
	}
	public static void main(String[] args) {
		
		//1.Flat50 2.Flat30 3.Flat20
		
		double total = 1000;
		double disc = MethodsDemo.getDiscountAfterPromoCode(2,total);
		System.out.println("Please pay:"+(total-disc));
	

	}

}


// Assisnment : optimize the above logic
//        1.check if user is entring correct code to get discounts
//		  2. if amount > 1000 flat 50 can be applied
//   3.if ammount is >500 and less than flat 30
//   4. if amm is >200 and <500 flat 10
//5.we cannot give discount below 200
//6.also tell user what code is better from him/her in case a wrong code is applied
