/*
class Parent{
	Parent(){
		System.out.println(">>Parent Object Constructor");
	}
}

class Child extends Parent{ // extends->Creates a relationship | Inheritance
	Child(){
		System.out.println(">>Child Object Constructor");
	}
}
public class ISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent p1 = new Parent();
		Child c1 = new Child();
		
		//Rule1: When we give command to create an object of child , then an object of parent class is automatically created
		
		
	}

}
*/
class Parent{
	//Whatever is written in class ..is property of object 
	//if static is written then it is property of class
	//Attributes of parent object
	String fname;
	 String lname;
	int money;
	Parent(){
		System.out.println(">>Parent Object Constructor");
	}
	//Method  :Property of Parent object | non-static
	void setDetails(String fname, String lname, int money){
		this.fname = fname;
		this.lname = lname;
		this.money = money;
	}
	void showDetails(){
		System.out.println("***************");
		System.out.println(">>Name "+fname+" "+lname+"  has "+money+" money ");
		System.out.println("***************");
	}
	
	//super is a reference variable which(contains hashcode of parent object) points to parent class object
	
}

class Child extends Parent{// extends->Creates a relationship | Inheritance
	
	String fname;
	//String lname;
	int money;
	Child(){
		System.out.println(">>Child Object Constructor");
		//String l = super.lname;
	}
/*	void setDetails(String fname, String lname, int money){
		super.setDetails("George", "Watson" ,12344);
		this.fname = fname;
		this.lname = lname;
		this.money = money;
	}*/
	void showDetails(){
		//super.showDetails();
		System.out.println("====================");
		System.out.println(">>Name "+fname+" "+super.lname+"  has "+money+" money ");
		System.out.println("====================");
}
}
public class ISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent p1 = new Parent();
		Child c1 = new Child();
		c1.setDetails("John", "watson", 100000);
		c1.showDetails();
		System.out.println(c1.fname);
		System.out.println(c1);
		//System.out.println(super);
		//Rule1: When we give command to create an object of child , then an object of parent class is automatically created
		//Rule2: Whatsoever is in Parent object can be accessed by child object
		//if something is private in parent class, that cannot be used by object
		//Rule3: if child has attribute or method, which is in parent as well, 
		//in this case child will access its own data and methods
	}
//	same parent class method in child class called Hiding
	// same parent object method in  child object calles Overriding 

}
