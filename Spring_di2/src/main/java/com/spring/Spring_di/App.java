package com.spring.Spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ){
    	ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml");
    	Employee e = (Employee)cpx.getBean("emp");
    	System.out.println(e);
    	System.out.println(e.getName());
    	System.out.println(e.getExperience());
    	
    	Employee ee = (Employee)cpx.getBean("emp");
    	System.out.println(ee);
    	System.out.println(ee.getName());
    	System.out.println(ee.getExperience());
    }
}
