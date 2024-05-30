package com.practice.demo.test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class SupplierDemo {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Supplier<String> supplier = ()->"Hi Java techie from Lambda Expression" ; 
		// Internally calls get() method of Supplier Interface
//		System.out.println(supplier.get());	
		
		List<String> list  = Arrays.asList("a", "b");
		List<String> list1  = Arrays.asList();
		
		System.out.println( list.stream().findAny().orElseGet(()->"Hi Java techie from Lambda Expression")); // return a as output, because findAny method get the data in list 
		System.out.println( list1.stream().findAny().orElseGet(()->"Hi Java techie from Lambda Expression"));// Return the string printed "Hi Java techie from Lambda Expression"
																											 //	bcs, it didn't get any element in the list
	}


}
