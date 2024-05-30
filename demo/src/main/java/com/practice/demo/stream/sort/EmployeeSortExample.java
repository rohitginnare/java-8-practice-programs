package com.practice.demo.stream.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Sorting based on some specific field, custom sorting 
public class EmployeeSortExample {
	
	public static void main(String args[])
	{
		List<Employee> employees = DataBase.getEmployees();
		
		//sort employees on basis of Salary
//		Collections.sort(employees, new MyComparator());
		//Descending order 
//		Collections.sort(employees, (o1,o2) -> o2.getSalary() - o1.getSalary()); // passing Lambda Representation of compare method of Comparator FI 
//		System.out.println(employees);
		
		employees.stream().sorted((o1,o2) -> o1.getSalary() - o2.getSalary()).forEach(t->System.out.println(t)); // 
	
		
		
	}
}

//class MyComparator implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		
//		return o1.getSalary() - o2.getSalary();  // Ascending order 
//	}
//	
//}