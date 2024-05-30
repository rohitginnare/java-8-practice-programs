package com.practice.demo.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(165);
		list.add(3);
		list.add(43);
		list.add(10);
		
		//Using Traditional Method
//		Collections.sort(list); //Ascending
//		System.out.println(list);
//		
//		Collections.reverse(list); // Descending (Only reverses the order of list of elements present)
//		System.out.println(list);
		
		//Using Stream API
//		list.stream().sorted().forEach(t->System.out.println(t)); // Ascending order
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));  // Descending order using sorted method of stream
		
		
		
		
	}

}
