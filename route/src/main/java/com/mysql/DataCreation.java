package com.mysql;

import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class DataCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ExecutorService tpe=Executors.newFixedThreadPool(100);
		int i=0;
        while (i<100)
        {
	     
	        System.out.println("sub thread:"+i);   
	        tpe.submit(new MysqlHandler(i));
	        i++;
	            
        }
        
       
        tpe.shutdown();

	}

}
