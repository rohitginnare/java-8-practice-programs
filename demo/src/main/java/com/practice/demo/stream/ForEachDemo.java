
// How to use forEach() method for List and Map 
package com.practice.demo.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rohit");
		list.add("Arun");
		list.add("Java Techie");
		list.add("Tarun");
		list.add("Rohan");
		
//		list.stream().forEach(t->System.out.println(t));
		list.stream().filter(t->t.startsWith("R")).forEach(t->System.out.println(t)); // filter method use with list elements starts with "R"
		
		//Map forEach Method
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Rohit");
		map.put(2, "Rohan");
		map.put(3, "Java Techie");
		map.put(4, "Roshan");
		
//		map.forEach((key, value) -> System.out.println(key+" : "+value)); // Here we are not using forEach method of stream, this is forEach() method of map.
		
//		How to use forEach() method for stream
//		map.entrySet().stream().forEach(t-> System.out.println(t)); // this will internally use for each of stream
		
		//Elements with even key 
		map.entrySet().stream().filter(t->t.getKey() %2==0).forEach(t->System.out.println(t)); 
		// filter using test(conditional check) method of Predicate interface internally
		//forEach() method uses accept() method of Consumer Interface internally
		
		
	}

}
