package com.fastjson;

import com.alibaba.fastjson.JSONObject;
import com.route.Person;

public class jsonTesting {
	
	public static void main(String[] args) {
		
		Person pp=new Person();
		pp.setId(1);
		pp.setName("ada");
		
		String jsonString = JSONObject.toJSONString(pp);
		System.out.println(jsonString);
	}

}
