package com.auribises.main;
/*
import java.util.ArrayList;
import java.util.Scanner;

import com.auribises.controller.DBHelper;
import com.auribises.model.Customer;
*/
import com.auribises.view.AddCustomerGUI;

public class App {

	public static void main(String[] args) {

		AddCustomerGUI gui = new AddCustomerGUI();
		gui.showGUI();
	}
}	
	
		
		/*
		// Write data directly in attributes
		Customer cRef = new Customer();
		cRef.cid = 0;
		cRef.name = "Kim";
		cRef.phone = "+91 98564 25639";
		cRef.email = "Kim@example.com";
		
		// Using Setter Method to write data in attributes
		Customer cRef2 = new Customer();
		cRef2.setCid(0);
		cRef2.setName("Fionna");
		cRef2.setPhone("+91 78965 14526");
		cRef2.setEmail("fionna@example.com");
		
		// Used constructors to write data in attribute
		Customer cRef3 = new Customer(0, "Leo", "+91 78956 14563", "leo@example.com");
		
		
		System.out.println(">> cRef Details:");
		System.out.println(cRef);
		System.out.println();
		
		System.out.println(">> cRef2 Details:");
		System.out.println(cRef2);
		System.out.println();
		
		System.out.println(">> cRef3 Details:");
		System.out.println(cRef3);
		System.out.println();
		
		
		// 1.Driver Loaded
		DBHelper db = new DBHelper();
		
		//2. Connection Created
		db.createConnection();
		Scanner scan = new Scanner(System.in);
		

		System.out.println("Enter ur choice:");
		System.out.println("1. Save Customer in DB");
		System.out.println("2. Update the Customer");
		System.out.println("3. Delete the Customer");
		System.out.println("4. View all the Customers");
		int choice = scan.nextInt();
		if(choice == 1) {
			//3. Save customer in DB
			Customer cRef = new Customer();
			
			System.out.println(">> Enter name of Customer:");
			cRef.name = scan.nextLine();
			
			System.out.println(">> Enter phone of Customer:");
			cRef.phone = scan.nextLine();
			
			System.out.println(">> Enter email of Customer:");
			cRef.email = scan.nextLine();
			
			System.out.println(">> Enter the ID of the customer:");
			cRef.cid = scan.nextInt();
			System.out.println();
			
			System.out.println("Customer Details:>>");
			System.out.println(cRef);
			db.saveCustomerInDB(cRef);
		}
		else if(choice == 2) {
			Customer cRef = new Customer();
			
			System.out.println(">> Enter name of Customer:");
			cRef.name = scan.nextLine();
			
			System.out.println(">> Enter phone of Customer:");
			cRef.phone = scan.nextLine();
			
			System.out.println(">> Enter email of Customer:");
			cRef.email = scan.nextLine();
			
			System.out.println(">> Enter the ID of the customer:");
			cRef.cid = scan.nextInt();
			System.out.println();
			
			System.out.println(" Updated Customer Details:>>");
			System.out.println(cRef);
			
			
			db.updateCustomerInDB(cRef);
		}
		else if(choice == 3) {
			Customer cRef = new Customer();
			
			System.out.println(">> Enter the ID of the customer:");
			int cid = scan.nextInt();
			System.out.println();
			db.deleteCustomerFromDB(cid);
			
		}
		else {
			ArrayList<Customer> customerList = db.fetchCustomersFromDB();
			System.out.println("Viewing all the Customers:>>");
			
			for(Customer cRef: customerList) {
				System.out.println(cRef);
			}
		}
		db.closeConnection();
		
		System.out.println("Would u like to update the customer:(yes/no)??");
		String choice = scan.nextLine();
		if(choice.equals("yes")) {
			db.updateCustomerInDB(cRef);
		}
		*/
		
		//db.deleteCustomerFromDB(2);
		
		
	
		
	

