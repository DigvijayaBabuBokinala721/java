package com.hello;

public class Example {
	static {
		n = 1; //'NoError' Since we can write, but we can't read
		
		//System.out.println(n); // we can't read if we try to read, it will throw IllegalForwardReference Error
		
		//no worries we have solution
		
		System.out.println(Example.n);//we can read using class name since its a static variable if in case it is non-static then we have to use 'this' keyword
	}
	static int n = 2;
	public static void main(String[] args) {
		System.out.println(n);
	}

}
