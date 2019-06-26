package com.auribises;

public class WrapperClasses {

	public static void main(String[] args) {
		int i = 10;
		char c = 'a';
		double d = 40.5;
		
		//Boxing
		//Converting primitives into Objects
		Integer i1 = new Integer(i);
		Character c1 = new Character(c);
		Double d1 = new Double(d);
		System.out.println(i1); // here toString of Object class will automatically be executed
		
		//Auto-Boxing
		Integer i2 = i;
		Character c2 = c;
		Double d2 = d;
		
		//UnBoxing
		int j = i1.intValue();
		char ch = c1.charValue();
		double d3 = d1.doubleValue();
		
		//Auto-Unboxing
		int j1 = i1;
		char ch1 = c1;
		double d31 = d1;
		
		
		
		
	}

}
