package com.hello;

class Example1{
	final static String s = "hello";
	static
	{
		System.out.println("Example1 - loaded");
	}
}
public class Example {

	public static void main(String[] args) {
		System.out.println(Example1.s);
	}
	//output will be only hello and 'Example1 class' will not be loaded since we are accessing final variable which is constant
}
