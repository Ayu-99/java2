
public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Object Way NOT-THREAD-SAFE
		StringBuilder builder = new StringBuilder("Hello");
		builder.append("Wrold");
		System.out.println(">>Builder is:"+builder);
		
		//THREAD-SAFE I.E SYNCHRONISATION
		StringBuffer  buffer = new StringBuffer("Hello");
		buffer.append("World");
		System.out.println(">>Buffer is:"+buffer);

		//SEE H.W 
	}

}
