package com.banking.PaymentService.Classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Venkya implements I_student {
   
	@Override
	public void greet() {
  System.out.println("good morining .....!!!");		
	}

	@Override
	public void dance() {
		 System.out.println("venkya danchinh....!!!!");
	}

	
}
