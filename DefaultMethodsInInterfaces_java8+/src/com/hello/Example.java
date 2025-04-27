package com.hello;

interface I1{

	default int m() { //default methods will be converted to public by the compiler
		return 1;
	}
	
}

class Example1{
	
	public int m() {
		return 2;
	}
	
}

public class Example extends Example1 implements I1{// here we are forced to make the m() in Example1 as public

	public static void main(String[] args) {
		Example e = new Example();
		System.out.println( e.m() );
	}

}
