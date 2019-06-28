class Printer{
	synchronized void printDocument(String name, int copies){
		
		// Lock will be acquired by a thread which calls the function first when execution will start
		for(int i=0;i<=copies;i++){
			System.out.println(">>Printing "+name+ " Copy#"+i);
		}
		// Lock will release after the execution
	}
	synchronized void showInkStatus(){
		System.out.println(">>Ink Status is 80%");
		
	}
}

class MyThread extends Thread{
	
	MyThread(Printer p){
		pRef = p;
	}
	Printer pRef; //HAS-A
	public void run(){
		//synchronized(pRef){
			//pRef.wait(); //Processing below this will not be done
			pRef.printDocument("**JohnsProfile.pdf", 10);
			pRef.showInkStatus();
		//}
	}
}
class YourThread extends Thread{
	
	YourThread(Printer p){
		pRef = p;
	}
	Printer pRef; //HAS-A
	public void run(){
		//synchronized(pRef){
		pRef.printDocument("**FionnasProfile.pdf", 10);
		pRef.showInkStatus();
		// pRef.notify();
		// pRef.notifyAll();
		
		//}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		
		System.out.println("App Started>>");
		
		Printer pRef = new Printer();
		//pRef.printDocument("**JohnsProfile.pdf", 10);
		MyThread mRef = new MyThread(pRef);
		YourThread yRef = new YourThread(pRef);
		
		mRef.start(); //Lock Acquisation
		/*
		try {     // we use synchronized instead of join because it makes more 
		// dynamic as join will have to be written after every start
			mRef.join();
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		yRef.start();
		/*
		try {
			yRef.join();
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
		
		System.out.println("App Finished>>");
		//Multiple Threads using the same object 
	}

}
// Recursive Lock-> Thread again and again acquire lock
// see h.w
