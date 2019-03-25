package com.springannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.springannotation.bean.Person;

@Configuration
@ComponentScan(value="com.springannotation.bean")
public class MainConfig2 {
	
	@Bean(name="person")
	public Person Person()
	{    
		Person pp=new Person("Chris",41);
		return pp;
		
		
	}

}
