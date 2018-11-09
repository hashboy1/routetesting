package com.oom;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;

public class oom {
	
	
	/*
	 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		at java.nio.HeapByteBuffer.<init>(HeapByteBuffer.java:57)
		at java.nio.ByteBuffer.allocate(ByteBuffer.java:335)
		at com.oom.oom.main(oom.java:21)

	 */
	
	public static void main(String[] args) throws Exception {
		
		HashMap<Object, Object> hs=new HashMap();
		int i =0;
		
		while (true)
		{
			 FileChannel fin =  new FileInputStream("f:\\1.obj").getChannel();
			 ByteBuffer buff = ByteBuffer.allocate((int) fin.size());
			 fin.read(buff);
			 fin.close();	 
			 hs.put(i, buff);
			 System.out.println(hs.size());
			 i++;
			
		}

	}

}
