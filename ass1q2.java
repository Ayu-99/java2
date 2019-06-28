import java.util.Scanner;
public class ass1q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter no. of elements in array: ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int j=n;
		int a[]=new int[n];
		System.out.println(" enter values in array:");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int b[]=new int[]{0,0,0,0,0};
		
		int p;
		System.out.println("enter how many places u want to shift: ");
		p=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			j=(i+p)%n;
			b[j]=a[i];
			
		}
		
		System.out.println();
		System.out.println("array before shifting:");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
	    System.out.println();
	    System.out.println("array after shifting: ");
	    for(int i=0;i<n;i++)
	    {
	    	System.out.print(b[i]+" ");
	    }
		
		

	}

}
