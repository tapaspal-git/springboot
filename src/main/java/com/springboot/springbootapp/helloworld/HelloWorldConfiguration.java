package com.springboot.springbootapp.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
    public Person person3Parameters(String methodName, int methodAge, @Qualifier("address2") Address customAddress){
        return new Person(methodName, methodAge, customAddress);
    }

    @Bean(name="customAddress")
    @Primary
    public Address address(){
        return new Address("Middleton Park Road", "Leeds");
    }

    @Bean
    @Qualifier("address2")
    public Address address2(){
        return new Address("Chappeltown", "Leeds");
    }

}
