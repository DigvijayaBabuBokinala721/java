package com.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
	public static void main(String[] args) {
		ArrayList<List<Integer>> li = new ArrayList<List<Integer>>();
		li.add(List.of(1,2));
		li.add(List.of(3,4));
		li.add(List.of(5));
		System.out.println(li);
		
		Stream<List<Integer>> s = li.stream();
		List<Integer> l = s.flatMap(List::stream).collect(Collectors.toList());
		System.out.println(l);
		
	}
}

