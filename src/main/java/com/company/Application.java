package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        Customer cust = context.getBean(Customer.class); //check whether there is a customer bean available in the container or not
        // If the Bean is available, then the Spring framework is injecting the customer object in your application.
        // So, basically, this object is created by the Spring framework, which can be further used in the application.
        cust.display();
    }
}
