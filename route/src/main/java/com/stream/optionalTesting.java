package com.stream;


import java.util.Optional;
import java.util.stream.Stream;

public class optionalTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		Stream<Integer> ss=Stream.of(1, 2, 3, 4);
		Optional accResult = ss.reduce((acc, item) -> {
	                System.out.println("acc : " + acc);
	                acc += item;
	                System.out.println("item: " + item);
	                System.out.println("acc+ : " + acc);
	                System.out.println("--------");
	                return acc;
	            });
	    System.out.println(accResult.get());
	
	   
		
		
	}

}
