package com.route;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Main {
	
	
	
	static{
		
		System.out.println("static program");
		
	}
	 public static void pringtLabel()
	 {
		 System.out.println("pringtLabel");
	 }
	public static void main(String[] args) {
		
		Integer i=127;
		Integer a=12888;
		
		System.out.println(i!=127);
		System.out.println(a!=256);
		
		
		try
		{
			String aa=null;
			aa.length();
			
		}
		catch(Exception ex)
		{
			System.out.println("Error:"+ex.toString());
			ex.printStackTrace();
		}
		
	/*
		Scanner sc = new Scanner(System.in); 	
		String ss= sc.nextLine(); 
		System.out.println(Main.swapVocabulary(ss));
	*/
	}
    
    public static String swapVocabulary(String inputStr)
	{
		String temp;
        String flag;
        String returnvlaue="";
            if (inputStr.substring(0,1).equals("-"))
            {
                flag="-";
                temp=inputStr.substring(1,inputStr.length());
            }
            else
            {
                flag="";
                temp=inputStr;
            }
        
           if (temp.length()<2)  returnvlaue = temp;
           else
           {
               String[] ta=temp.split("");
               
            for (int i=ta.length-1; i>=0; i--)
            {   
            	System.out.println(ta[i]);
                returnvlaue+=ta[i];
            }
               }
        return flag+Integer.parseInt(returnvlaue);
		
	}
	
	
}
