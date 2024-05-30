package com.practice.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo { // implements Predicate<Integer>

//	@Override
//	public boolean test(Integer t) {
//		if(t%2==0)
//			return true;
//		else
//			return false;
//	}

	public static void main(String[] args) {
//		Predicate<Integer> predicate = new PredicateDemo();
//		System.out.println(predicate.test(10));

//		Predicate<Integer> predicate = t -> t % 2 == 0;
//		{
//			if (t % 2 == 0)
//				return true;
//			else
//				return false;
//		};
//			System.out.println(predicate.test(10));
//		}
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.stream().filter(t -> t % 2 == 0).forEach(t-> System.out.println("Printing Even : "+ t)); 
		//internally filter() method will call the test() method of Predicate interface and return boolean true/false
		
	}
}
