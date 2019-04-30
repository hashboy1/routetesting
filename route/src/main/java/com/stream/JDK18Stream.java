package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.Test;

public class JDK18Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> integerStream = Stream.of(10, 20, 30, 40);String[] cityArr = {"Beijing", "Shanghai", "Chengdu"};
		Stream<String> cityStream = Stream.of(cityArr);
		Stream<String> nameStream = Arrays.asList("Daniel", "Peter", "Kevin").stream();
		Stream<String> cityStream2 = Arrays.stream(cityArr, 0, 1);
		Stream<String> emptyStream = Stream.empty();
		
		
		Stream<String> echos = Stream.generate(() -> "echo");
		Stream<Integer> integers = Stream.iterate(0, num -> num + 1);

		
		List<String> langList = Arrays.asList("Java", "Python", "Swift", "HTML");
		Stream<String> mapStream = langList.stream().map(String::toUpperCase);
		
	    //遍历打印所有成员
		mapStream.forEach(w -> System.out.println(w));

	}
	
	
	@Test
	public void reduceTest() {
	    Optional accResult = Stream.of(2, 4, 6, 8)
	            .reduce((acc, item) -> {
	                System.out.println("acc : " + acc);
	                acc += item;
	                System.out.println("item: " + item);
	                System.out.println("acc+ : " + acc);
	                System.out.println("--------");
	                return acc;
	            });
	    System.out.println(accResult);
	}

}
