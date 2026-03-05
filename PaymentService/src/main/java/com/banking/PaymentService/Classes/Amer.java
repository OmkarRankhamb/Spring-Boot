package com.banking.PaymentService.Classes;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("Amar")
public class Amer implements I_student {

	@Override
	public void greet() {
    System.out.println("good afer");		
	}

	@Override
	public void dance() {
   System.out.println("Break dancing amer....!!!!");		
	}

}
