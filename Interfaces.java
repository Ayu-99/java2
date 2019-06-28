//Rule Book
interface Inf1{
	int i=10; // public static final int i=10;
	void show(); //public abstract void show()
	void fun();
}
interface Inf2{
	void hello();
	void fun();
}
interface Inf3 extends Inf1, Inf2{
	
}
// Multiple Implementation and not multiple inheritance
class CA implements Inf3{
	public void show(){
		System.out.println("hello");
		
	}
	public void fun(){
		System.out.println("hi");
	}
	public void Bye(){
		System.out.println("Bye");
	}
	public void hello(){
		System.out.println("Tata");
	}
}
// Multiple Inheritance is supported in interfaces


public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. Polymorphic statement
		Inf1 i1 = new CA();
		i1.show();
		i1.fun();
		//i1.Bye();
		Inf2 i2 = new CA();
		i2.fun();
		i2.hello();
		CA c1 = new CA();
		c1.Bye();
		System.out.println("i is:"+Inf1.i);
		Inf3 i3 = new CA();
		i3.show();
		i3.fun();
		i3.hello();
		//i3.bye(); error because bye() is not a method of interface Inf3
	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		