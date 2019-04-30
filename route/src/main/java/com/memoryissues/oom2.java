package com.memoryissues;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.HashSet;

public class oom2 {
	
	
	/*
	 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		at java.nio.HeapByteBuffer.<init>(HeapByteBuffer.java:57)
		at java.nio.ByteBuffer.allocate(ByteBuffer.java:335)
		at com.oom.oom.main(oom.java:21)

	 */
	
	static HashMap<Object, Object> hs;
	
	public static void main(String[] args) throws Exception {
		
		hs=new HashMap();
		int i =0;
		
		while (true)
		{
			 String aa="aa";
			 hs.put(i, aa);
			 System.out.println(hs.size());
			 i++;
			
		}

	}

}
