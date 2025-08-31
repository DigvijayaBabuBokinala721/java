package com.hello;

import java.util.Objects;

public class Employee {
	private int id;

	public Employee(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		System.out.println("checking the hashCode for id " + id + " to determine the bucket");
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("reference is not same yet duplicate not found so checking for content(id)");

//		obj instanceof Employee e ? e.id == this.id : false;
		if(obj instanceof Employee e) {
			if(e.id == this.id)
				System.out.println("id already exist replacing the value for id "+id);
			return e.id == this.id;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee(id=" + id + ")";
	}
	
	
	
}
