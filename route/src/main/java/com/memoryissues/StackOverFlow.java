package com.memoryissues;

public class StackOverFlow {
	
	public static int recursion(int var)
	{
		
		var=(int) Math.random();
		
		
		
		return recursion(var);
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		
		int i = StackOverFlow.recursion(0);
		
		System.out.println(i);
	}

}
