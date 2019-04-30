package com.route;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class testMapper {

	
	public static void main(String[] args) {
		
		/*
		HashMap<String,Integer> hm=testMapper.getMaxChar("abngjddddabb");
		
		for (Map.Entry<String,Integer> m:hm.entrySet())
		{
			System.out.println("key:"+m.getKey()+" vlaue:"+m.getValue());		
		}
		
		Map hm1=testMapper.getMaxChar2("abngjddddabb");
		Iterator ia = hm1.entrySet().iterator();

		while (ia.hasNext())
		{   
			Map.Entry<String, Integer> temp=(Entry<String, Integer>) ia.next();
			System.out.println("key:"+temp.getKey()+" vlaue:"+temp.getValue());		
		}
		*/
		
		String[] s= "dddfffff".split("");
		
		System.out.println(s[3]);
		
		
		Scanner sc = new Scanner(System.in); 
		
		String ss= sc.nextLine(); 
		System.out.println(testMapper.swapVocabulary(ss));
	}
	
	
	public static HashMap<String,Integer>  getMaxChar(String inputStr)
	{	
		HashMap<String,Integer> hm=new HashMap<String,Integer>();	
		for (int i=1; i<=inputStr.length(); i++)
		{		
			String temp=inputStr.substring(i-1,i);
			System.out.println(i+" "+ temp);
			if (hm.get(temp) == null) hm.put(temp, 1);
			else hm.put(temp, (Integer)hm.get(temp) +1);
		}	
		return hm;
          
		
	}
	
	
	public static Map getMaxChar2(String inputStr)
	{	
		HashMap hm=new HashMap();	
		for (int i=1; i<=inputStr.length(); i++)
		{		
			String temp=inputStr.substring(i-1,i);
			System.out.println(i+" "+ temp);
			if (hm.get(temp) == null) hm.put(temp, 1);
			else hm.put(temp, (Integer)hm.get(temp) +1);
		}	
		return hm;

		
	}
	
	
	
	public static String swapVocabulary(String inputStr)
	{
		
		LinkedList ll=new LinkedList();
		String returnValue="";
		String[] ss=inputStr.split(" ");
		for (int i=0; i < ss.length ; i ++)
		{
			ll.push(ss[i]);
		}
		
		while (!ll.isEmpty())
		{
			returnValue+=ll.removeFirst()+" ";
			
		}
		return returnValue;
		
	}
	
	
}
