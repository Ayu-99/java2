package com.auribises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Student{
	int roll;
	String name;
	void show(){
		System.out.println(roll+"|"+name);
	}
	public String toString(){
		return roll+"|"+name;
	}
}

public class ListAPI {

	public static void main(String[] args) {
		
		// 1.Collection ArrayList Creation
		List l1 = new ArrayList(); // Polymorphic statement
		//ArrayList l1 = new ArrayList(); // Direct Object Creation
		
		List l2 = new ArrayList<String>();
		
		List l3 = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.roll = 10;
		s1.name = "John";
		
		Student s2 = new Student();
		s2.roll = 11;
		s2.name = "Jennie";
		
		// 2.Adding elements in ArrayList
		l1.add(10);
		l1.add("Mia");
		l1.add(34.5);
		l1.add(s1);
		
		l2.add("Jim");
		l2.add("Jack");
		l2.add("Kia");
		
		l3.add(s1);
		l3.add(s2);
		
		//3.Size of List
		System.out.println("Size of l1 is:"+l1.size());
		System.out.println("Size of l2 is:"+l2.size());
		System.out.println("Size of l3 is:"+l3.size());
		
		//4.View Data in List
		System.out.println("=====l1======");
		System.out.println(l1);
		
		System.out.println();
		System.out.println("=====l2======");
		System.out.println(l2);
		
		System.out.println();
		System.out.println("=====l3======");
		System.out.println(l3);
		
		System.out.println();
		
		//5.Read a single value from list
		Object o1 = l1.get(2);
		System.out.println(o1);
		
		//6. Add data in between
		
		System.out.println("l2 before add"+l2);
		l2.add(2, "Esther");
		System.out.println("l2 after add"+l2);
		System.out.println();
		
		//7.Update data in list
		l1.set(2, 40.5);
		System.out.println(l1);
		
		//8.Delete from list
		l1.remove(2);
		System.out.println(l1);
		
		//l1.clear();
		//System.out.println(l1);
		
		if(l2.contains("Kia")){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		List names = new ArrayList<String>();
		names.add("Emy");
		names.add("Joe");
		names.add("Katie");
		
		l2.addAll(names);
		System.out.println("l2 after:"+l2);
		System.out.println("names after:"+names);
		
		l2.add("Joe");
		System.out.println(l2);
		int idx = l2.indexOf("Joe");
		System.out.println(idx);
		int lidx = l2.lastIndexOf("Joe");
		System.out.println(lidx);
		
		// Read all elements in list
		
		System.out.println("Read elements using for loop");
		for(int i=0;i<l2.size();i++){
			Object nm = l2.get(i);
			System.out.println(">> "+nm);
		}
		System.out.println();
		System.out.println("Reading using enhanced for loop");
		for(Object nm: l2){
			System.out.println(">> "+nm);
		}
		
		System.out.println();
		System.out.println("Reading using Iterator:");
		Iterator<Object> iRef = l1.iterator();
		while(iRef.hasNext()){
			Object o = iRef.next();
			System.out.println(">> "+o);
		}
		
		System.out.println();
		System.out.println("Reading using list iterator");
		ListIterator <Object> o = l1.listIterator();
		while(o.hasNext()){
			Object oRef = o.next();
			System.out.println(">> "+oRef);
		}
		
		
		System.out.println();
		List v1 = new Vector();
		v1.add(11);
		System.out.println(v1);
		
		
		
		
		
		
		
		
		
		
	}

}
