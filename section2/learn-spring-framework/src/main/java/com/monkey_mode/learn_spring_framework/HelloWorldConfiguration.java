package com.monkey_mode.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
};

record Address(String street, String city) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "SuphachaiBean";
    }

    @Bean
    public Integer age() {
        return 20;
    }

    @Bean
    @Primary
    public Person person() {
        var person = new Person("Suphachai", 20, new Address("Main St", "Anytown"));
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("123 Main St", "Anytown");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Main St 3", "Anytown");
    }
}
