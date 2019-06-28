package session3;

public class Conditions {

	public static void main(String[] args) {
	final int olaMicro = 1; //no write operation.... only read operation
		int olaMini = 2;
		int olaSedan = 3;
		int olaShare = 4;
		int olaBike = 5;
		
		int selectedTypeOfCab = olaMini;
		
		if(selectedTypeOfCab == olaMicro)
			System.out.println("OLA micro cab booked");
			
		else if(selectedTypeOfCab == olaMini)
			System.out.println(" ola mini cab booked");
		
		else
			System.out.println("booked");
	
	/**switch(selectedTypeOfCab)
	{
	case 1:
		break;
	case 2:
		break;
	case 3:
		break;
	default:
		
	}**/
}

}