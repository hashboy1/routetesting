package com.randomfile;

import java.io.RandomAccessFile;

public class randomfileTesting {
	/** 
	 * 追加方式 
	 * 写的方法 
	 * @param path 文件路径 
	 * ***/  
	public static void randomWrite(String path){  
	    try{  
	        /**以读写的方式建立一个RandomAccessFile对象**/  
	        RandomAccessFile raf=new RandomAccessFile(path, "rw");  
	          
	        //将记录指针移动到文件最后  
	        raf.seek(raf.length());  
	        raf.write("我是追加的 \r\n".getBytes());  
	          
	    }catch(Exception e){  
	        e.printStackTrace();  
	    }  
	      
	}  
	
	
	public static void main(String[] args) {
		randomfileTesting.randomWrite("c:\\test.txt");
	}

}
