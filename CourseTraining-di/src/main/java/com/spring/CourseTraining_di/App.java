package com.spring.CourseTraining_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml");

        JavaTrainer jt = (JavaTrainer) cpx.getBean("javaTrainer");
        WebTrainer wt = (WebTrainer) cpx.getBean("webTrainer");
        SqlTrainer st = (SqlTrainer) cpx.getBean("sqlTrainer");

        System.out.println(jt);
        System.out.println(jt.getName());

        System.out.println(wt);
        System.out.println(wt.getName());

        System.out.println(st);
        System.out.println(st.getName());
        
        cpx.close(); 
    }
}

