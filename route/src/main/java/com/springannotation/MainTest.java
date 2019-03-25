package com.springannotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.springannotation.bean.Person;

public class MainTest {

	//public static void main(String[] args) {
	@Test  
	public void testa(){
		// TODO Auto-generated method stub
		ApplicationContext ac=new AnnotationConfigApplicationContext(MainConfig.class);
		Person pp=(Person) ac.getBean(Person.class);
        System.out.println(pp);
        String[] nl=  ac.getBeanNamesForType(Person.class);
        for ( String name:nl)
        {
        	System.out.println("Person Bean:"+name);
        }
           
        AnnotationConfigApplicationContext ap=new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names=  ap.getBeanDefinitionNames();
        for ( String name:names)
        {
        	System.out.println(name);
        }
        
    	Person p1=(Person)ap.getBean(Person.class);
    	 System.out.println(p1);

    	 Environment ev= ac.getEnvironment();
    	 System.out.println(ev.getProperty("os.name"));
        
    	
	}

}
