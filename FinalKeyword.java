// final class cannot be extended i.e inherited | No o2o and c2c
final class Parent{
	final void purchaseBike(){
		System.out.println(">>Lets buy bajaaj pulsar");
	}
	
}
/*class Child extends Parent{
	// final method cannot be overriden
	void purchaseBike(){
		System.out.println("lets buy royal enfield");
	}
	
}*/
public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100;
		i=100;
		
		//FINAL VARIABLE
		final int j =20;
		//j=200;
		// final j cannot be modified and it is a read only container
		
		
		//FINAL BLANK VARIABLE
		final int k;
		k=10;
		//k=1000;
		
	}

}
