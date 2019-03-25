package com.queue;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;;

public class noBlockingQueue {
	
	public static void main(String[] args) throws InterruptedException {
		
         //none blocking queue
		ConcurrentLinkedQueue cq=new ConcurrentLinkedQueue();
		String aa="abcdefg";
		
		cq.add(aa);
		String cc=(String) cq.poll();
		System.out.println(cc);
		String dd=(String) cq.poll(); //if the queue is empty, it will return null.
		System.out.println(dd);
		
		
		//blocking queue
		LinkedBlockingQueue lbq=new LinkedBlockingQueue();
		lbq.add(aa);
		
		String ee=(String) lbq.take();
		System.out.println(ee);	
		String ff=(String) lbq.take();   //if the queue is empty, the thread will be blocked. but the poll function will not be blocked.
		System.out.println(ff);
		
	}
	
 
	
	

}
