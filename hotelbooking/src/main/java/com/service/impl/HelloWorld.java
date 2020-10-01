package com.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/hello1")
	public String hello() {
		return "Hello World!";
	}

}
