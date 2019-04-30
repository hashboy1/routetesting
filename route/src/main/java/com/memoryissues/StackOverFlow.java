package com.memoryissues;

public class StackOverFlow {
	
	public static int recursion(int var) throws Exception
	{
		
		var=(int) Math.random();
		
		
		
		return recursion(var);
		
		
		
	}
	
	public static void main(String[] args)  {
		
		try
		{

			int i = StackOverFlow.recursion(0);
			
			System.out.println(i);
			
		}
		catch(Throwable ex)
		{
			System.out.println("exception:"+ex.toString());
			ex.printStackTrace();
		}
		
	}

}
