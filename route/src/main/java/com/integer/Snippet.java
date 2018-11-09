package com.integer;

public class Snippet {
public static void main(String[] args){
	Snippet.test1();
	Snippet.test2();
	Snippet.test3();
	Snippet.test4();
	Snippet.test5();
	Snippet.test6();
	Snippet.test7();
	Snippet.test8();
}
public static void test1(){
 Integer m=127; 
 Integer n=127; 
 System.out.println(m==n); 
 System.out.println(m.equals(n)); 
 } 
 public static void test2(){ 
 Integer m=127; 
 int n=127; 
 System.out.println(m==n); 
 } 
 public static void test3(){ 
 Integer m=127; 
 Integer n=new Integer(127); 
 System.out.println(m==n); 
 System.out.println(m.equals(n)); 
 } 
 public static void test4(){ 
 Integer m=127; 
 Integer n=Integer.valueOf(127); 
 System.out.println(m==n); 
 System.out.println(m.equals(n)); 
 } 
  
 public static void test5(){ 
 Integer m=128; 
 Integer n=128; 
 System.out.println(m==n); 
 System.out.println(m.equals(n)); 
 } 
 public static void test6(){ 
 Integer m=128; 
 int n=128; 
 System.out.println(m==n); 
 } 
 public static void test7(){ 
 Integer m=128; 
 Integer n=new Integer(128); 
 System.out.println(m==n); 
 System.out.println(m.equals(n)); 
 } 
 public static void test8(){ 
 Integer m=128; 
 Integer n=Integer.valueOf(128); 
 System.out.println(m==n); 
 System.out.println(m.equals(n)); 
 } 
	}


