package com.jdk18;

import java.util.Optional;

public class Optionaltesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "John";
		Optional<String> os=Optional.ofNullable(name);
		os.of("ada");
		System.out.println(os.get());
		System.out.println(os.get());
	}

}
