package com.chinese;

import java.io.UnsupportedEncodingException;

public class codeChanged {
	
	
	public static void main(String[] args) throws UnsupportedEncodingException{
	String str = "任意字符串";
	//str = new String(str.getBytes("gbk"),"utf-8");
	System.out.println( new String(str.getBytes(),"UTF-8"));
	System.out.println( new String(str.getBytes("ISO-8859-1"),"UTF-8"));
	System.out.println( new String(str.getBytes("GBK"),"UTF-8"));
	System.out.println( new String(str.getBytes("UTF-8"),"UTF-8"));
	}

}
