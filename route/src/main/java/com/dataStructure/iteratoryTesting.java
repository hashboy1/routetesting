package com.dataStructure;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class iteratoryTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
	    Integer[] intArray=new Integer[]{1,2,3,4,5,6,7,8,9,10};    //the int array is not okay.
        List<Integer> lint=Arrays.asList(intArray);
        Iterator<Integer> it=lint.iterator();
        while (it.hasNext()) {
        	Integer a =  it.next();
        	System.out.println(a);
        }
	}

}
