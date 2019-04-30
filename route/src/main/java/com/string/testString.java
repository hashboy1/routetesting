package com.string;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.route.Person;


@EnableAspectJAutoProxy
public class testString {

	@Test
	public void test(){
		
		String a = new String();
		a="abc";
		System.out.println(a.hashCode());
		a="efg";
		System.out.println(a.hashCode());   //hashcode不同,所以String是每次都创建新的对象
		
		
		StringBuffer c=new StringBuffer();
		StringBuilder d=new StringBuilder();
		
		
		Person pp=new Person();
		pp.equals(a);
		pp.setId(1);
		pp.setName("abc");
		System.out.println(pp.hashCode());   
		System.out.println(pp.toString());
		pp.setId(2);
		pp.setName("efg");
		System.out.println(pp.hashCode());   //hashcode相同
		System.out.println(pp.toString());
		
		Person p1=new Person();
		p1.setId(3);
		p1.setName("hij");
		System.out.println(p1.hashCode());   
		System.out.println(p1.toString());
		
		
		String abc=new String("abc");
		System.out.println(abc.hashCode());
		//System.out.println(31*97+98);
		System.out.println(31*(31*97+98)+99);
		
		
		
		System.out.println(StringUtils.isNumeric("99"));
		System.out.println(StringUtils.isNumeric("123456"));
		
	}
	
}
