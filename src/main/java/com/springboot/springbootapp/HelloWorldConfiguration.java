package com.springboot.springbootapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address){}
record Address(String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String methodName(){
        return "Tapas";
    }
    @Bean
    public int methodAge(){
        return 36;
    }
    @Bean
    public Person person(){
        return new Person("Souvik", 35, new Address("Moorlay", "Leeds"));
    }
    @Bean
    public Person person2MethodCall(){
        return new Person(methodName(), methodAge(), address());
    }
    @Bean
    public Person person3Parameters(String methodName, int methodAge, Address customAddress){
        return new Person(methodName, methodAge, customAddress);
    }

    @Bean(name="customAddress")
    public Address address(){
        return new Address("Middleton Park Road", "Leeds");
    }

}
