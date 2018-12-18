package com.guava;

import java.util.ArrayList;

import com.google.common.collect.Lists;
import com.google.common.reflect.TypeToken;

public class reflect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> stringList = Lists.newArrayList();
		ArrayList<Integer> intList = Lists.newArrayList();
		System.out.println(stringList.getClass().isAssignableFrom(intList.getClass()));
		
		TypeToken<String> stringTok = TypeToken.of(String.class);
		TypeToken<Integer> intTok = TypeToken.of(Integer.class);
		
		
	}

}
