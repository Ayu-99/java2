package com.auribises.packtwo;
import com.auribises.packone.Three;
//import com.auribises.packone.One;
// default class cannot be accesses into another package
// public class can be accesses into another package
class Four extends Three{
	void show(){
	protShow(); // Indirectly
	//defShow();
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Two packages can be have class of same name
		Three t1 = new Three();
		t1.pubShow();
		//t1.protShow();
		// t1.defShow();
		//t1.pvrShow();
		Four f1 = new Four();
		f1.pubShow();
		//f1.protShow();
		f1.show();
	}

	
}

/* Nichod:
 * 1.private can only be accessed inside the class in which it is declared and 
 * outside the class with the help of classname. But it cannot be accessed inside
 * another class and another package
 * 
 * 2.public can be accessed inside the same package and in another package also.
 * 
 * 3.protected can be accessed in the extended class in other package
 * 
 * 4.defalut cannot be ""                          ""          ""
 *
 * 
 */
  
  
