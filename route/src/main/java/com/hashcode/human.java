package com.hashcode;

import java.util.HashMap;

public class human {
	
	private static int a=1;
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	human()
	{
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap hm=new HashMap();
		
		System.out.println("abcdef".hashCode());
		System.out.println("abcdef".hashCode()&15);
    
		
		human hm=new human();
		hm.setA(12);
		System.out.println(hm.getA());
		System.out.println(human.a);
	}

}
