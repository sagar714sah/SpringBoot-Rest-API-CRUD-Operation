package com.ibm.spring_boot_rest_api_crud_operation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value= "/user")
@RestController
public class UserController {

	
	@RequestMapping(value="/getProductDetails",method=RequestMethod.GET)
	public String getProductDetails() {
		return "my Amazing product ";
	}
	
	
	@GetMapping("/addTwoNumber/{a1}/{b1}")
	public Integer additionOfTwoNumber(@ PathVariable (name="a1") Integer a,@ PathVariable (name="b1") Integer b) {
		
		return a+b;
		
	}
}
