package com.digvijay;

import com.digvijay.fi.I1;

public class Example {

	String exampleMethod() {
		return """
				
				4th way of implementing a Functional Interface 
				using Method Reference"
				
				""";
	}
	
	public static void main(String[] args) {
		I1<Example> i1 = Example::exampleMethod;
		
		System.out.println(i1.m(new Example()));
	}

}
