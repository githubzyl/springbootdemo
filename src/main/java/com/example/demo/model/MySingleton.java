package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MySingleton extends Singleton {

	public void doSomething() throws Exception {
		List<String> collected = new ArrayList<>();
		collected.add("alpha");
		collected.add("beta");
		System.out.println(collected);
		collected = collected.stream().map(string -> string.toUpperCase()).collect(Collectors.toList());
		System.out.println(collected);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void filter(List<String> names, Predicate condition) {
		for (String name : names) {
			if (condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}

}
