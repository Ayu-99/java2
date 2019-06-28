/*
 * Order
 * 	oid
 * 	name
 * 	restaurant
 * 	price
 */
class Order
{
	int oid;
	String name;
	String restaurant;
	int price;
	
	//Special method : property of object
	//Default constructor
	// so that we can provide some initial values to our attributes/objects
	Order(){
		oid = 1;
		name = "NA";
		restaurant = "NA";
		price = 100;
		
	}
	Order(int o, String n, String r, int p){
		oid = o;
		name = n;
		restaurant = r;
		price = p;
		
	}
	
	//Method  :Property of object
	void showOrderDetails(){
	
	System.out.println(">>Thank You "+name+" for placing order from "+ restaurant);
	System.out.println("Your order is: "+oid+" Please pay "+price);
	}
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1= new Order();
		o1.showOrderDetails();
		Order o2= new Order();
		o2.showOrderDetails();
		Order o3= new Order(200,"Ayushi","Maharaja regency",700);
		o3.showOrderDetails();


	}

}


// Method which perform only logical operations is called Buisness method