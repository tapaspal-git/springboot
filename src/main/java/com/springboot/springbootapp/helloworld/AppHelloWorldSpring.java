package com.springboot.springbootapp.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppHelloWorldSpring {

    public static void main(String[] args) {
        //1: Launch a spring context
        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

            //2. Configure the things that we want Spring to manage  -
            //Helloworld configuration  - @Configuration
            //name @Bean

            //3: Retrieving Beans managed by Spring
            System.out.println(context.getBean("methodName"));
            System.out.println(context.getBean("methodAge"));
            System.out.println(context.getBean("customAddress"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean(Address.class));
            System.out.println("------------------------------------");
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
