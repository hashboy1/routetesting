package com.hystrix;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class hystrixTesting {

	 public static void main( String[] args ) throws Exception
	    {
		   /*
		   ThreadPoolExecutor tpe=new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
	                new ArrayBlockingQueue<Runnable>(5));
		   */
		   FutureTask<String> ft=new FutureTask<String>(new  Callable<String>()
				   {
				@Override
				public String call() throws Exception {
					String returnvalue="message summary:";
						String a= null;
						 System.out.println(a.substring(1));
					return returnvalue;
				}
				   });
		   ft.run();
           System.out.println(ft.isDone());
          try{
           ft.get();
            }
            catch(Exception ex)
            {   
            	System.out.println("service level down");
            	ex.printStackTrace();
            	
            }
	    
	    }
	
	
	
}
