package com.banking.PaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.banking.PaymentService.Classes.Teacher;

@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(PaymentServiceApplication.class, args);
	
	
   Teacher tech = context.getBean(Teacher.class);
   
   tech.Chekingdance();
	
	
	}

}
 