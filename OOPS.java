/*
 * OOPS-Object oriented programming structure
 * 
 * Real World:
 * 
 * Object is anything which we can see and touch
 * Object is a reality or real thing->real  time entity
 * 
 * Class
 * 
 *
 */
class User{
	//Attributes
	String name;
	int phone;
	String email;
	char gender;
	byte age;
	String address;
	
	//Method: Property of user object not of class
	// non-static method property is of object
	void setDetailsOfUser(String n , int p,String e,byte a,char g,String ad){
		//write operation
		name = n;
		phone = p;
		email = e;
		age = a;
		gender = g;
		address = ad;
		
		
	}
	void show()
	{
		System.out.println("name:"+name);
		System.out.println("phone is:"+phone);
		System.out.println("address is:"+address);
		System.out.println("age is:"+age);
		System.out.println("gender is:"+gender);
		System.out.println("email is:"+email);
		
	}
	
} 
class FoodItem{
	String name;
	String description;
	int price;
	char type;
	
}
public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int[] arr = new int[]{10,20,30,40};
		
		//object creation statement
		
		User u1 = new User();
		User u2 = new User();
		User u3 = u1; //reference copy
		//u1 ,u2,u3 are reference variables and contains hashcode of object
		//new creates  object which is a container in the heap at run time
		
		
		System.out.println(">>i is:"+i);
		System.out.println(">>arr is:"+arr);
		System.out.println(">>u1 is:"+u1);
		System.out.println(">>u2 is:"+u2);
		System.out.println(">>u3 is:"+u3);
		
		//1.write data in object
		u1.name=" john";
		u1.phone= 123456789;
		u1.email = "ayushisharma5141@gmail.com";
		u1.gender = 'm';
		u1.address = "98 gmnt";
		u1.age = 22;
		
		u2.name=" fionna";
		u2.phone= 1234974789;
		u2.email = "ayushi5141@gmail.com";
		u2.gender = 'f';
		u2.address = "987 gmnt";
		u2.age = 20;
		
		
		//2. update data in object
		u1.name = "john watson";
		u2.name = "fionna flynn";
		
		//3.read data from object
		System.out.println(u1.name+" is "+u1.age+" years old and lives in "+u1.address);
		
		
		//4.Delete operation
		//objects are deleted automatically in java by garbage collector which is present in JVM
		
		System.out.println();
		u1.setDetailsOfUser("Ayushi", 9877, "ayushisharma5141", (byte)30, 'f', "golden");
		u1.show();
		
	}

}
