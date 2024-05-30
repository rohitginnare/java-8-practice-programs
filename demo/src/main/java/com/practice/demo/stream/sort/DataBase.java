package com.practice.demo.stream.sort;

import java.util.ArrayList;
import java.util.List;

//DAO Layer
public class DataBase {
	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Rohit", 10000));
		employees.add(new Employee(2, "Rohan", 50000));
		employees.add(new Employee(1, "Java Techie", 20000));
		employees.add(new Employee(1, "Roshan", 90000));
		return employees;
	}
}
