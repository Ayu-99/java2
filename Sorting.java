import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++){
			
			a[i] = scan.nextInt();
		}
		
		System.out.println("Enter whether u want array in ascending(0) or descending order(1)");
		int ch = scan.nextInt();
		if(ch==0){
		
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(a[i]>a[j]){
						int temp;
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
						
				}
					
			}
		}
		else{
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(a[i]<a[j]){
						int temp;
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			
		}
		System.out.println("Array after sorting is:");
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		scan.close();
			
		

	}

}
