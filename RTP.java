class Cab{
	void bookCab(String source, String destination){
		System.out.println(">>Cab booked");
	}
}

public class RTP { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cab  c1 = new Cab();
		c1.bookCab("Silver Arc", "MBD Mall");
		
		
	}

}
