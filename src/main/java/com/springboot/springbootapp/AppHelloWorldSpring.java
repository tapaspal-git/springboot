package com.springboot.springbootapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

    public static void main(String[] args) {
        //1: Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring to manage  -
        //Helloworld configuration  - @Configuration
        //name @Bean

        //3: Retrieving Beans managed by Spring
        System.out.println(context.getBean("methodName"));
        System.out.println(context.getBean("methodAge"));
        System.out.println(context.getBean("customAddress"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
    }
}
