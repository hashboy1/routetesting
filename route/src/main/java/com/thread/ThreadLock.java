package com.thread;

public class ThreadLock {

	 private final Object left = new Object();
	 private final Object right = new Object();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ThreadLock tl=new ThreadLock();
		
		
		Thread a =new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					tl.funcA();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		Thread b =new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					tl.funcB();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		
		a.start();
		b.start();
		
		

	}
	
	
	
     public void funcA() throws InterruptedException
	{   
    	 
    	 synchronized (left)
         {
             Thread.sleep(2000);
             synchronized (right)
             {
                 System.out.println("function a end!");
             }
         }
	}
     
     public  void funcB() throws InterruptedException
 	{
    	 synchronized (right)
         {
             Thread.sleep(2000);
             synchronized (left)
             {
                 System.out.println("function b end!");
             }
         }
 	}

}
