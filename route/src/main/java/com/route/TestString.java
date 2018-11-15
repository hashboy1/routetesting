package com.route;

import com.route.Main;

public class TestString {

	public static void main(String[] args) {
     Main.pringtLabel();
		
     String a = "login:123";
     System.out.println(a.substring(0,6));
     System.out.println(a.substring(6));
     String b= "to:123;abcdef";
     int semicolon;
     semicolon = b.indexOf(";");
     System.out.println("to user:" + b.substring(3,semicolon));
     System.out.println("message:" + b.substring(semicolon+1));
     
     String url="http://192.168.0.160:8080/examples/JSONRPC.Service.PrintService.class";
     String urlarray[]=url.split("/");
     for (String e:urlarray) 
     {
    	 System.out.println("Sub String:"+ e);
     }
     
     Main.pringtLabel();
     
	}

}
