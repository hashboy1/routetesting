package com.concurrent;



import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class blockedQueue {
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayBlockingQueue ab=new ArrayBlockingQueue(100);   //if the size is Integer.MAX_VALUE , system will show the java.lang.OutOfMemoryError: Requested array size exceeds VM limit
		
		String[] st= { "aa","bb","cc" };
		
		ab.add(st[0]);
		ab.add(st[2]);
		ab.add(st[1]);
        
		while (!ab.isEmpty())
		{
		System.out.println(ab.poll());
		}

		
		BlockingQueue<String> unbounded = new LinkedBlockingQueue<String>();
		
		unbounded.put("aa1");
		unbounded.put("bb2");
		unbounded.put("cc3");
		while(!unbounded.isEmpty())
		{
			System.out.println(unbounded.take());
		}
	}

}
