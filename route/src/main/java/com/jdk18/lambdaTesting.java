package com.jdk18;

public class lambdaTesting {
	
	 public static void main(String[] args) {
	
		 MathOperation greetService1 = (int x, int y) -> x+y;
	     System.out.println(greetService1.plus(5,9));
	 }
	 
	 
	 public interface MathOperation {
			int plus(int a,int b);
	
		}

}


