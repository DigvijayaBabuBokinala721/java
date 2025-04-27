package com.hello;

public class Example {

	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(127);
		Integer i2 = Integer.valueOf(127);
		System.out.println(i1 == i2); //true

		Integer i3 = Integer.valueOf(128);
		Integer i4 = Integer.valueOf(128);
		System.out.println(i3 == i4); //false, since pooling will be applied to Integers within byte range of values

		//Note: pooling will not be there for Double, Float
	}

}
