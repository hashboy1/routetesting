package com.offheap;

import java.lang.reflect.Field;

import com.route.Person;

import sun.misc.Unsafe;


public class UnsafeTest {
    
    @SuppressWarnings("restriction")
	public static void main(String[] args) throws Exception {
   
    	Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe = (Unsafe) theUnsafe.get(null);
      
        long a= unsafe.allocateMemory(1024);
        long b= unsafe.allocateMemory(2048);
        unsafe.reallocateMemory(a, 1024);
        unsafe.reallocateMemory(b, 1024);
        unsafe.freeMemory(a);
        unsafe.freeMemory(b);

        
        
        Person person = (Person) unsafe.allocateInstance(Person.class);
        person.setId(1);
        person.setName("ada");
        System.out.println(person.hashCode());   //print memory address
        
        
        /*
        Person p2=new Person();
        p2.setId(2);
        p2.setName("ben");
        System.out.println(p2);
        */
       
        Person p3 = (Person)unsafe.getObject(Person.class, person.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p3.getName());
   

     
        
    }
}