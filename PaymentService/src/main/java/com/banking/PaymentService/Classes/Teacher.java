package com.banking.PaymentService.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

	
    @Autowired
    @Qualifier("Amar")
	private I_student stud;
	
	
	
	public void Chekingdance() {
	   stud.dance();
	   stud.greet();
	}
}
