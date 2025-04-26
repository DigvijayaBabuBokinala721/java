package com.hello;

class Example1{
	
	String s = "Hello";
	
	public Example1 m(){
		System.out.println("Example1");
		return new Example1();
	}
	
}

class Example2 extends Example1{
	
	String s = "hi";
	@Override
	public Example2 m(){
		System.out.println("Example2");
		return new Example2();
	}
	
}

public class Example {
	static void m(Example1 e1) {//Loose Coupling and RunTime Polymorphic Behaviour
		
		System.out.println( (e1.m()).s );//Imp Note: variables will not override
	}
	public static void main(String[] args) {
		m(new Example2());
	}

}
