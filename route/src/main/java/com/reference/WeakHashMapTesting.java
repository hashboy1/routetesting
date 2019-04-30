package com.reference;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import com.route.Person;

public class WeakHashMapTesting {
	
	
	public static void main(String[] args) {
		
	    Map<Integer,Person> mp=new HashMap<Integer,Person>();
	    
	    Person p1=new Person();
	    p1.setId(1);
	    p1.setName("cc");
	    Integer i=new Integer(129);
	    /*
	    mp.put(i, p1);
	    p1=null;
	    i=null;
	    System.out.println(mp);
	    System.gc();
	    System.out.println(mp);  
	    */
	    
	    
	    Map<Integer,Person> mp2=new WeakHashMap<Integer,Person>();
	    mp2.put(i, p1);
	    p1=null;
	    i=null;
	    System.out.println(mp2);
	    System.gc();
	    System.out.println(mp2);
	    
	}

}
