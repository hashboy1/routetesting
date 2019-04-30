package com.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	
	public static void main(String[] args) throws Exception {
		
		SemaphoreDemo sd=new SemaphoreDemo();
		sd.execute();
	   
		//ConcurrentHashMap<String, String> chm=new ConcurrentHashMap<>();
		
	
	}
	
	
	public void execute()
	{
		 ExecutorService tpe=Executors.newFixedThreadPool(100);
		  Semaphore se=new Semaphore(2);
		  
		  for (int i =0;i<=100;i++)
		  {
		      tpe.execute(new MyRunabled(se,i));
		  }
		
	}

	
	class MyRunabled implements Runnable
	{
        
		Semaphore sp;
		int userID ;
		
		MyRunabled(Semaphore sp,int userID)
		{
			this.sp=sp;
			this.userID=userID;
			
		}
		
		
		@Override
		public void run() {
			
			try {
				sp.acquire();
				System.out.println("User ID:" + userID + " begin");
				Thread.sleep((long) (Math.random()*1000));			
				System.out.println("User ID:" + userID + " end");
				sp.release();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
