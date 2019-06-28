package com.auribises.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.auribises.model.Customer;


public class DBHelper {
		
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	public DBHelper() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1.Driver Loaded");
		} catch (Exception e) {
			System.out.println(">> Some exception: "+e);
		}
	}
	
	public void createConnection() {
		try {
			String user = "root";
			String password = "";
			String url = "jdbc:mysql://localhost/ayu-db2?serverTimezone=UTC";
			
			con = DriverManager.getConnection(url, user, password); 
			System.out.println(">> 2.Connection Created ");
			
		}catch(Exception e){
			System.out.println(" Some exception: "+e);
		}
	}
	
	public void saveCustomerInDB(Customer cRef) {
		try {
			
			//3.1 Write SQL Statement using String
			String sql = "insert into Customer values(null, '"+cRef.name+"', '"+cRef.phone+"', '"+cRef.email+"')";
			
			//3.2 Execute SQL statement
			stmt = con.createStatement();
			
			//executeUpdate -> insert, update, delete
			int i = stmt.executeUpdate(sql); // execute SQL statement
			System.out.println("3. "+cRef.name+" Saved in DB ! "+i);
			
			} catch (Exception e) {
			
			System.out.println("Some exception: "+e);
		}
	}
	public void updateCustomerInDB(Customer cRef) {
		try {
		String sql = "update Customer set name=?, phone=?, email=? where cid=?";
		
		pStmt = con.prepareStatement(sql);
		pStmt.setString(1, cRef.name);
		pStmt.setString(2, cRef.phone);
		pStmt.setString(3, cRef.email);
		pStmt.setInt(4, cRef.cid);
		
		int i = pStmt.executeUpdate();
		System.out.println(">>3. "+cRef.name+" Updated in DB!!"+i);
		
		}catch(Exception e) {
			System.out.println("Some exception:"+e);
		}
		
	}
	
	public void deleteCustomerFromDB(int cid){
		try {
		String sql = "delete from Customer where cid=?";
		pStmt = con.prepareStatement(sql);
		pStmt.setInt(1, cid);
		int i = pStmt.executeUpdate();
		
		System.out.println("Customer with cid:"+cid+"deleted"+i);
		}catch(Exception e) {
			System.out.println("Some exception:"+e);
		}
		
		
	}
	public ArrayList<Customer> fetchCustomersFromDB(){
		
		ArrayList<Customer>customers = new ArrayList<Customer>();
		try {
			String sql = "select * from Customer";
			
			pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()) {
				Customer cRef = new Customer();
				cRef.cid = rs.getInt(1);
				cRef.name = rs.getString(2);
				cRef.phone = rs.getString(3);
				cRef.email = rs.getString(4);
				
				customers.add(cRef);
			}
			
		} catch (Exception e) {
			System.out.println("Some exception: "+e);
		}
		return customers;
		
		
	}
public void closeConnection() {
	try {
		con.close();
	} catch (Exception e) {
		System.out.println("4. Connection Closed");
	}
}
	}


