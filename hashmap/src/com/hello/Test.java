package com.hello;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		HashMap<Employee, String> hm = new HashMap<Employee, String>();
		Employee emp1 = new Employee(1010);
		Employee emp2 = new Employee(1011);
		Employee emp3 = new Employee(1012);
		Employee emp4 = new Employee(1010);
		
		hm.put(emp1,"vijay");
		hm.put(emp2,"chinnu");
		hm.put(emp3,"Digvijay");
		hm.put(emp4,"vijay1");
		System.out.println(hm);
	}
}
