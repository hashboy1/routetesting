package com.hystrix;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TimeoutTesting {

	 public static void main( String[] args ) throws Exception
	    {
		   
		   ExecutorService tpe=Executors.newFixedThreadPool(10);
		   FutureTask<String> ft=new FutureTask<String>(new  Callable<String>()
				   {
				@Override
				public String call() throws Exception {
					String returnvalue="message summary:";
						 //String a= null;
						 //System.out.println(a.substring(1));
						 Thread.sleep(5000);
						 System.out.println("thread finished");
					return returnvalue;
				}
				   });
		   //ft.run();
		   tpe.submit(ft);
		   Thread.sleep(2000);
		  // System.out.println(ft.isDone());
		   if (!ft.isDone())
		   {	   
			   ft.cancel(true);
			   System.out.println("thread stop");
			   throw new TimeoutException();
		   }
		   
		   //System.out.println(ft.get());
		  
          tpe.shutdownNow();
          
          
          
	    
	    }
	
	
	
}
