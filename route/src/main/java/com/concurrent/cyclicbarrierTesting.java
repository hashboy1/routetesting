package com.concurrent;

import java.util.concurrent.CyclicBarrier;
//import java.util.concurrent.




public class cyclicbarrierTesting {
	 static CyclicBarrier c = new CyclicBarrier(3);
	 
	 
	 
	     public static void main(String[] args) {
	    	 
	    	 
	         new Thread(new Runnable() {
	             @Override
	             public void run() {
	                 try {
	                     c.await();
	                 } catch (Exception e) {
	                 }
	                 System.out.println(1);
	             }
	         }).start();
	         
	         
	         new Thread(new Runnable() {
	             @Override
	             public void run() {
	                 try {
	                     c.await();
	                 } catch (Exception e) {
	                 }
	                 System.out.println(3);
	             }
	         }).start();
	         
	         
	         try {
	             c.await();
	         } catch (Exception e) {
	         }
	         
	         System.out.println(2);
	     }

	
}
