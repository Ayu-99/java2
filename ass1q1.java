import java.util.Scanner;
public class ass1q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,m=4,c=0,y;
		int x=0;
		System.out.println("enter no.of candies present: ");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		//int l[]=new int[n];
		int z=n/2;
		for(int i=0;i<z;i++)
		{
	
			y=(x+m)%n;
		
				c=c+1;
				x=y;
				
			
		}
		System.out.println("candies ate are:"+c);
		
		

	}

}

