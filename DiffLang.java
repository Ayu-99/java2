import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class DiffLang {
	public void Java(String data){
		
		try{
			
			File file = new File("E:\\Movies\\MyApp.java");
			FileWriter writer  = new FileWriter(file);
			writer.write(data);
			writer.close();
			
			
			
		}
		catch(Exception e){
			System.out.println(">>Exception is:"+e);
			
		}
		
		try{
			
			File file = new File("E:\\Movies\\MyApp.java");
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = " ";
			
			while((line = buffer.readLine()) != null){
				System.out.println(line);
			}
			buffer.close();
			reader.close();
			
		}catch(Exception e){
			System.out.println(">>Exception:"+e);
			
		}
		
	}
public void Cpp(String data){
		
		try{
			
			File file = new File("E:\\Movies\\MyApp.cpp");
			FileWriter writer  = new FileWriter(file);
			writer.write(data);
			writer.close();
			
			
			
		}
		catch(Exception e){
			System.out.println(">>Exception is:"+e);
			
		}
		
		try{
			
			File file = new File("E:\\Movies\\MyApp.cpp");
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			
			String line = " ";
			
			while((line = buffer.readLine()) != null){
				System.out.println(line);
			}
			buffer.close();
			reader.close();
			
		}catch(Exception e){
			System.out.println(">>Exception:"+e);
			
		}
		
	}
	

	public static void main(String[] args) {
		
		System.out.println("Enter the choice:");
		System.out.println("1.C 2.Cpp 3.Java 4.Python 5.Scala 6.Go 7.Dart 8.R");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		if(choice == 2){
			String d = "#include<iostream>"
					+ "\n"
					+ "int main(){"
					+ "\n\t"
					+ "cout<<'Hello World'"+"}";
			DiffLang d1 = new DiffLang(); 
			d1.Cpp(d);
			
					
					
		}
		if(choice == 3){
			String d = "public class Main{"
					+ "\n\n\t"
					+ "public static void main(String []args){"
					+ "\n\n"
					+ "\tSystem.out.println("+"'"+"Hello World"+"'"
							+ ""+")"
					+ "\n"
					+ "}";
			
			DiffLang d1 = new DiffLang(); 
			d1.Java(d);
		}
	}

}
