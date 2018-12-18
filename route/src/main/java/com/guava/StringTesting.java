package com.guava;

import com.google.common.base.Joiner;

public class StringTesting {

	public static void main(String[] args) {
		Joiner joiner = Joiner.on("; ").skipNulls();
		System.out.println(joiner.join("Harry", null, "Ron", "Hermione"));


	}

}
