package com.reference;

import java.lang.ref.WeakReference;

import com.route.Person;

public class referencetesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Person p1=new Person();
		p1.setId(11);
		p1.setName("cc");
		Person p2=p1;
		System.out.println("init");
		System.out.println(p1);
		System.out.println(p2);
		p1=null;
		System.out.println("set null");
		System.out.println(p1);
		System.out.println(p2);
		System.gc();
		System.out.println("after gc");
		System.out.println(p1);
		System.out.println(p2);
	*/
		
		Person p1=new Person();
		p1.setId(11);
		p1.setName("cc");
	
		WeakReference<Person> p2= new 	WeakReference<Person>(p1);
		System.out.println("init");
		System.out.println(p1);
		System.out.println(p2.get());
		p1=null;
		System.out.println("set null");
		System.out.println(p1);
		System.out.println(p2.get());
		System.gc();
		System.out.println("after gc");
		System.out.println(p1);
		System.out.println(p2.get());
		
		
		
	}

}
