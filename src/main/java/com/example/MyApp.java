package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);

        MessageService messageService2 = applicationContext.getBean("randomMessageService", MessageService.class);

        //System.out.println(messageService.getMessage());

        System.out.println("Zmienna nr 1 = "+messageService.hashCode());
        System.out.println("Zmienna nr 2 = "+messageService2.hashCode());

        applicationContext.close();
    }
}
