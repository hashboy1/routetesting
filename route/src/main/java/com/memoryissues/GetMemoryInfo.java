package com.memoryissues;

public class GetMemoryInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime run = Runtime.getRuntime();
		System.out.println("JVM最大的内存量" + run.maxMemory()/(1024*1024)+"M");
		System.out.println("JVM的空闲内容量" + run.freeMemory()/(1024*1024)+"M");

	}

}
