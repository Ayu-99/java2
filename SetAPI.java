package com.auribises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetAPI {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(11, "John");
		m1.put(12, "Jane");
		m1.put(13, "Bella");
		
		// Read Operation
		System.out.println("m1 is:"+m1);
		
		//Reading a single element
		System.out.println(m1.get(11));
		
		if(m1.containsKey(12)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		Set<Integer> keys = m1.keySet();
		
		
		//Delete Operation
		
		System.out.println(m1.remove(12));
		System.out.println(m1);
		
		//Reading all values of a hashmap
		Iterator<Integer> i1 = keys.iterator();
		while(i1.hasNext()){
			int key = i1.next();
			String value = m1.get(key);
			System.out.println(key+" >> "+value);
		}
		
		//HashTable is thread-safe i.e Synchronized
		
		
		
		
	}

}
