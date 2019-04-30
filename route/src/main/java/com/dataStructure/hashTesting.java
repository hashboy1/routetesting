package com.dataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class hashTesting {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("Rajib Sarma","100");
		map.put("Rajib Sarma","200");//The value "100" is replaced by "200".
		map.put("Sazid Ahmed","200");

		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry entry = (Map.Entry) iter.next();
		    Object key = entry.getKey();
		    Object val = entry.getValue();
		    
		    System.out.println(val);
		}
		
		HashSet hs=new HashSet();
		ConcurrentHashMap hm=new ConcurrentHashMap(); 
		
		Map table=new Hashtable();
		

	}

}
