package com.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class activeThread {
	
	public static void main(String[] args) {
		
		System.out.println(Thread.activeCount());
		
		Collections.synchronizedCollection(new ArrayList());
		
		System.out.println(Thread.currentThread().getName());
		
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
	}

}
