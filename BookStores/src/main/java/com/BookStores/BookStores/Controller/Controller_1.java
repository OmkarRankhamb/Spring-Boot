package com.BookStores.BookStores.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class Controller_1 {
     @GetMapping("/g")
	public String First() {
		return "This is the first method";
	}
    @GetMapping("/g1")
     public String Second() {
    	 return "This is the second method";
     }
}
