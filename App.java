package com.auribises.main;

import java.io.File;

import java.io.FileWriter;
import java.util.Scanner;

import com.auribises.model.Customer;

public class App {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();// ctrl+space
		Scanner scan = new Scanner(System.in);
		
		/*
		c1.name = "John";
		c1.phone = "+91 12345 69854";//hard - code data
		c1.email = "john@";
		*/
		
		System.out.println("Enter Customer Name:");
		c1.name = scan.nextLine();
		
		System.out.println("Enter Customer Phone:");
		c1.phone = scan.nextLine();
		
		System.out.println("Enter Customer Email:");
		c1.email = scan.nextLine();
		
		System.out.println("Customer Details:>>>");
		System.out.println(c1.toCSV());
		
		// Problem- When object is created in memory it is in RAM
		// Data in object and object itself is temporarily available
		// When Program will finish, data will be lost i.e Object will be deleted from memory
		
		//Solution:
		// Persistence -> Saving data of Object
		//Save objects data somewhere:
		//1.Files
		//2.DataBase
		
		System.out.println("Would you like to save "+c1.name+"? yes/no:");
		String choice = scan.nextLine();
		if(choice.equals("yes")){
			try {
				File file = new File("E:\\Movies\\Customer.csv");
				FileWriter writer = new FileWriter(file, true); //true means append
				
				String data = c1.toCSV();
				writer.write(data);
				
				writer.close(); //Release Memory Resources
				System.out.println("File written with data");
				
			} catch (Exception e) {
				System.out.println(">>Some errors:"+e);
			}
		}	
	}

}
